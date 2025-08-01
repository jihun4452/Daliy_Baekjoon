# [Gold IV] 이진 검색 트리 - 5639 

[문제 링크](https://www.acmicpc.net/problem/5639) 

### 성능 요약

메모리: 31228 KB, 시간: 460 ms

### 분류

그래프 이론, 그래프 탐색, 트리, 재귀

### 제출 일자

2025년 7월 28일 14:58:24

### 문제 설명

<p>이진 검색 트리는 다음과 같은 세 가지 조건을 만족하는 이진 트리이다.</p>

<ul>
	<li>노드의 왼쪽 서브트리에 있는 모든 노드의 키는 노드의 키보다 작다.</li>
	<li>노드의 오른쪽 서브트리에 있는 모든 노드의 키는 노드의 키보다 크다.</li>
	<li>왼쪽, 오른쪽 서브트리도 이진 검색 트리이다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/upload/images/bsearchtree.png" style="height:242px; width:426px"></p>

<p>전위 순회 (루트-왼쪽-오른쪽)은 루트를 방문하고, 왼쪽 서브트리, 오른쪽 서브 트리를 순서대로 방문하면서 노드의 키를 출력한다. 후위 순회 (왼쪽-오른쪽-루트)는 왼쪽 서브트리, 오른쪽 서브트리, 루트 노드 순서대로 키를 출력한다. 예를 들어, 위의 이진 검색 트리의 전위 순회 결과는 50 30 24 5 28 45 98 52 60 이고, 후위 순회 결과는 5 28 24 45 30 60 52 98 50 이다.</p>

<p>이진 검색 트리를 전위 순회한 결과가 주어졌을 때, 이 트리를 후위 순회한 결과를 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>트리를 전위 순회한 결과가 주어진다. 노드에 들어있는 키의 값은 10<sup>6</sup>보다 작은 양의 정수이다. 모든 값은 한 줄에 하나씩 주어지며, 노드의 수는 10,000개 이하이다. 같은 키를 가지는 노드는 없다.</p>

### 출력 

 <p>입력으로 주어진 이진 검색 트리를 후위 순회한 결과를 한 줄에 하나씩 출력한다.</p>

