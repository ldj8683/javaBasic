<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1">
	<tr>
		<td style="text-align:center; background:yellow; font-size: 20px; width: 150px; height: 50px;">
			컴퓨터 가격
		</td>
		<td style="text-align:center; background:yellow; font-size: 20px; width: 150px; height: 50px;">
			${vo.cPrice}
		</td>
	</tr>
	<tr>
		<td style="text-align:center; background:yellow; font-size: 20px; width: 150px; height: 50px;">
			컴퓨터 종류
		</td>
		<td style="text-align:center; background:yellow; font-size: 20px; width: 150px; height: 50px;">
			${vo.cProduct}
		</td>
	</tr>
	<tr>
		<td style="text-align:center; background:yellow; font-size: 20px; width: 150px; height: 50px;">
			마우스 가격
		</td>
		<td style="text-align:center; background:yellow; font-size: 20px; width: 150px; height: 50px;">
			${vo.mPrice}
		</td>
	</tr>
	<tr>
		<td style="text-align:center; background:yellow; font-size: 20px; width: 150px; height: 50px;">
			마우스 종류
		</td>
		<td style="text-align:center; background:yellow; font-size: 20px; width: 150px; height: 50px;">
			${vo.mProduct}
		</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:center; background:pink; font-size: 20px; width: 300px; height: 50px;">
			총 가격: ${vo.total}
		</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:center; background:pink; font-size: 20px; width: 300px; height: 50px;">
			<a href="ajax5.jsp">
				돌아가기
			</a>
		</td>
	</tr>
</table>