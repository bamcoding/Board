package net.gondor.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.gondor.service.IndexService;


@Controller
public class IndexController {
	IndexService indexService;
	
	public void setIndexService(IndexService indexService) {
		this.indexService = indexService;
	}

	@RequestMapping("/")
	public String viewIndexPage(){
		return "index";
	}
	
	@RequestMapping("/list")
	public ModelAndView viewListPage(){
		String date = indexService.getNowDate();
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("date",date);
		return view;
	}
}
