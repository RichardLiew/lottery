package me.zohar.lottery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	/**
	 * 登录页面
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "index";
	}

	/**
	 * 游戏管理页面
	 * 
	 * @return
	 */
	@GetMapping("/game-manage")
	public String gameManage() {
		return "game-manage";
	}
	
	/**
	 * 开奖情况
	 * @return
	 */
	@GetMapping("/lottery-situation")
	public String lotterySituation() {
		return "lottery-situation";
	}
	
	/**
	 * 投注记录
	 * @return
	 */
	@GetMapping("/betting-record")
	public String bettingRecord() {
		return "betting-record";
	}

}