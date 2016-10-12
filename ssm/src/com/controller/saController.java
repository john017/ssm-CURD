package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.model.T2Entity;
import com.service.saservice;

@Controller
@RequestMapping("/t2list")
public class saController {
	@Resource
	  private saservice saservice;
	int pagesize=10;
	  
	  @RequestMapping("/showT2")
	  public String saT2(HttpServletRequest request,Model model){
		  int page=1;
		  if(request.getParameter("page")!=null)
			  page=Integer.parseInt(request.getParameter("page"));
		  List<T2Entity> list = this.saservice.sa(page);
		  model.addAttribute("page", page);
		  model.addAttribute("allpage", this.saservice.Spage());
		  model.addAttribute("t2list", list);
		  return "showT2";
	  }
	  @RequestMapping("/update")
	  public String upT2(HttpServletRequest request,Model model){
		  int id=Integer.parseInt(request.getParameter("id"));
		  T2Entity int2=this.saservice.selectByid(id);
		  model.addAttribute("string", int2.getString());
		  model.addAttribute("id", id);
		  return "upT2";
	  }
	  @RequestMapping("/updateT2")
	  public String updT2(HttpServletRequest request,Model model){
		  int id=Integer.parseInt(request.getParameter("id"));
		  String str=request.getParameter("string");
		  T2Entity record=this.saservice.selectByid(id);
		  record.setString(str);
		  this.saservice.update(record);
		  return "redirect:/t2list/showT2";
	  }
	  @RequestMapping("/delete")
	  public String dlT2(HttpServletRequest request,Model model){
		  int id=Integer.parseInt(request.getParameter("id"));
		  this.saservice.delete(id);
		  return "redirect:/t2list/showT2";
	  }
	  @RequestMapping("/add")
	  public String addT2(HttpServletRequest request,Model model){
		  String str=request.getParameter("str");
		  T2Entity record=new T2Entity(str);
		  this.saservice.insert(record);
		  return "redirect:/t2list/showT2";
	  }
}
