package com.example.demo.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;


import lombok.Data;

/**
* メール情報 リクエストデータ
*/
@Data
public class MailForm implements  Serializable{
    private String from;
    /**
     * 宛先
     */
    @NotBlank(message = "宛先を入力してください")	
	private String sendTo;
	/**
	 * 件名
	 */
	@NotBlank(message = "件名を入力してください")
	private String subject;
    /**
    * 内容
    */
    @NotBlank(message = "内容を入力してください")
	private String content;
	}
