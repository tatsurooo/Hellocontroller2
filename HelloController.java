package com.sample.sample.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //クライアントのリクエストからJson形式のデータを返却
public class HelloController {
	@GetMapping("/hello") //localhost:8080/hello 「hello」で検索
	public String hello() { //「hello」で検索したときの文字列を返す
		return "hello world"; //「hello world」を返す
	}
}
