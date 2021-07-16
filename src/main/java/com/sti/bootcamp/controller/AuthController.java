/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author techinasia888
 */
@RestController
@RequestMapping("/auth")
@Api(tags = "auth")
public class AuthController {
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private CartService cartService;
//
//    private PostResponse response;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @PostMapping("/signup")
//    @ApiOperation(value = "${UserController.signup}")
//    @ApiResponses(value = {//
//            @ApiResponse(code = 400, message = "Something went wrong"), //
//            @ApiResponse(code = 403, message = "Access denied"), //
//            @ApiResponse(code = 422, message = "Username is already in use"), //
//            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
//    public PostResponse signup(@Valid @ApiParam("Signup User") @RequestBody User user) {
//        User newUser = userService.signup(user);
//        Cart newCart = new Cart();
//        newCart.setUser_id(newUser.get_id());
//        cartService.create(newCart);
//        response = new PostResponse(false, "Pendaftaran Berhasil");
//        return response;
//    }
//
//    @PostMapping("/signin")
//    @ApiOperation(value = "${UserController.signin}")
//    @ApiResponses(value = {//
//            @ApiResponse(code = 400, message = "Something went wrong"), //
//            @ApiResponse(code = 422, message = "Invalid username/password supplied")})
//    public PostResponse login( @Valid @ApiParam("logins") @RequestBody LoginRequest user) {
//        String token = userService.signin(user.getUsername(), user.getPassword());
//        response = new AuthResponse(false,"Login Berhasil",token);
//        return response;
//    }
//
//    @GetMapping(value = "/me")
//    @ApiOperation(value = "${UserController.me}", response = UserResponse.class)
//    @ApiResponses(value = {//
//            @ApiResponse(code = 400, message = "Something went wrong"), //
//            @ApiResponse(code = 403, message = "Access denied"), //
//            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
//    public UserResponse getCurrentUser( HttpServletRequest req) {
//        return modelMapper.map(userService.getCurrentUser(req), UserResponse.class);
//    }


}