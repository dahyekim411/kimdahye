<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="./include/header.jsp" %>


<section class="weare-section"><!-- division디비전이라는 div 영역표시 태그 대신에 사용 -->

<section class="weare-header">
<h1 class="section-title">WE ARE</h1>
<p>
맛있는 공간<br><!-- break중지 return엔터  줄바꿈태그-->
"언제나 멋진 날"입니다.
</p>
</section>
<!-- 겔러리게시판에서 가져오는 데이터 4개 반복영역(아래) -->
<section class="weare-body float-clear">
<ul>
<li>
<a href="javascript:;"><!-- a링크태그의 가상링크# 대신에 javascript:; 입니다. -->
<img src="/resources/sample/img/130.jpg" alt="디저트1">
<h2>무화과요거트케잌</h2>
<p>무화과생과와 건조무화과를 사용하여...</p>
</a>
</li>
<li>
<a href="javascript:;">
<img src="/resources/sample/img/132.jpg" alt="디저트2">
<h2>데빌스치즈케이크</h2>
<p>초코와 카라멜 크림치즈를 사용하여...</p>
</a>
</li>
<li>
<a href="javascript:;">
<img src="/resources/sample/img/134.jpg" alt="드링크1">
<h2>수제매실에이드</h2>
<p>수제매실청에 각종 베리류를 더하여...</p>
</a>
</li>
<li>
<a href="javascript:;">
<img src="/resources/sample/img/133.jpg" alt="세트1">
<h2>'멋진 날'세트</h2>
<p>언제나 멋진 날의 시그니처들을 모아...</p>
</a>
</li>
</ul>
</section>
</section>



<%@ include file="./include/footer.jsp" %>

