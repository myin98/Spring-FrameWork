<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>구구단</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {background-color: #2d2521;}
  </style>
</head>
<body>

	<div class="container mt-3">
	  <h1 class="text-white text-center">구구단</h1>
		<form action="" method="get">
			<div class="input-group mb-3">
        <select class="form-select" name="dan" id="dan">
          <option value="A">전체</option>
          <option value="1">1단</option>
          <option value="2">2단</option>
          <option value="3">3단</option>
          <option value="4">4단</option>
          <option value="5">5단</option>
          <option value="6">6단</option>
          <option value="7">7단</option>
          <option value="8">8단</option>
          <option value="9">9단</option>
        </select>
				<button class="btn btn-success" type="submit">
          <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-view-list" viewBox="0 0 16 16">
            <path d="M3 4.5h10a2 2 0 0 1 2 2v3a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2v-3a2 2 0 0 1 2-2m0 1a1 1 0 0 0-1 1v3a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1v-3a1 1 0 0 0-1-1zM1 2a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13A.5.5 0 0 1 1 2m0 12a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13A.5.5 0 0 1 1 14"/>
          </svg>
				</button>
			</div>
	  </form>
  </div>
<!-- 반복 시작-->
  <%
	Object obj = request.getAttribute("list");
	Object dan = request.getAttribute("dan");
// 	out.println(obj);
	if(obj != null) {
		List list = (List) obj;
		for(int i = 0; i < list.size(); i++) {
			int d = Integer.parseInt( dan.toString() );
%>
  <div class="container mt-3">
    <h2 class="text-white text-center"><%= d + i %>단</h2>
    <div class="row text-center mt-3 fs-3">
<%
		Object obj2 = list.get(i);
		if(obj2 != null) {
			List list2 = (List) obj2;
			for(int j = 0; j < list2.size(); j++) {
				Object obj3 = list2.get(j);
%>    
		      <div class="col-sm-4">
		        <p class="text-bg-light"><%=obj3%></p>
		      </div>
<%
			}
		}
%>
    </div>
  </div>
<%
		}
	}
%>

  <!-- <div class="container mt-3">
    <h2 class="text-white text-center">2단</h2>
    <div class="row text-center mt-3 fs-3">
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 1 = 2</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 2 = 4</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 3 = 6</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 4 = 8</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 5 = 10</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 6 = 12</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 7 = 14</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 8 = 16</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">2 * 9 = 18</p>
      </div>
    </div>
  </div>

  <div class="container mt-3">
    <h2 class="text-white text-center">3단</h2>
    <div class="row text-center mt-3 fs-3">
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 1 = 3</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 2 = 6</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 3 = 9</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 4 = 12</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 5 = 15</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 6 = 18</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 7 = 21</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 8 = 24</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">3 * 9 = 27</p>
      </div>
    </div>
  </div>
  
  <div class="container mt-3">
    <h2 class="text-white text-center">4단</h2>
    <div class="row text-center mt-3 fs-3">
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 1 = 4</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 2 = 8</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 3 = 12</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 4 = 16</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 5 = 20</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 6 = 24</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 7 = 28</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 8 = 32</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">4 * 9 = 36</p>
      </div>
    </div>
  </div>
  
   <div class="container mt-3">
    <h2 class="text-white text-center">5단</h2>
    <div class="row text-center mt-3 fs-3">
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 1 = 5</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 2 = 10</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 3 = 15</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 4 = 20</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 5 = 25</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 6 = 30</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 7 = 35</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 8 = 40</p>
      </div>
      <div class="col-sm-4">
        <p class="text-bg-light">5 * 9 = 45</p>
      </div>
    </div>
  </div> -->
<!-- 반복 끝 -->
</body>
</html>