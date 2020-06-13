package com.william.bcpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author LJH
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiverUser implements Serializable {

	private static final long serialVersionUID = -7028476581629590666L;
	private WilliamUser williamUser;
	
	private List<String> roles;
	
	private List<Integer> permissions;

	private List<Integer> menus;
}
