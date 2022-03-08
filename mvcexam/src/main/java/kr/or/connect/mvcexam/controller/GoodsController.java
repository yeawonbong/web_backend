package kr.or.connect.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class GoodsController {
	@GetMapping("/goods/{id}")
	public String getGoodsById(@PathVariable(name="id") int id,
								@RequestHeader(value = "User-Agent", defaultValue = "myBrowser") String userAgent,
								ModelMap model) {
		return "goodsById";
	}
}
