package com.maproom.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maproom.domain.Room;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/create-room")
public class CreateRoomServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        //COntent type: text/html; charset=utf-8
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        Room newRoom = new Room();
        //룸 객체에 사용자에게서 json 데이터 받은 것 채워넣기

        //랜덤 문자열 7자로 키값 생성하여 룸 객체에 넣기

        //몽고 DB에 데이터 저장하기

        //룸 객레 정보 토대로 jwt 토큰 생성하기



        String result = objectMapper.writeValueAsString(newRoom);
        response.getWriter().write(result);

    }
}
