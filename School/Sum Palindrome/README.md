<h2><a href="https://www.geeksforgeeks.org/problems/sum-palindrome3857/1?page=1&difficulty=School&status=unsolved&sortBy=submissions">Sum Palindrome</a></h2><h3>Difficulty Level : School</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a number, reverse it and add it to itself unless it becomes a palindrome or number of iterations&nbsp;becomes more than 5.</span><br><br><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: n = 23
<strong>Output:</strong>&nbsp;55&nbsp;
<strong>Explanation</strong>: reverse(23) = 32,then 32+23
= 55 which is a palindrome. </span>
</pre>
<p><br><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 73
<strong>Output: 121</strong>
<strong>Explanation</strong>: reverse(73) = 37,then 37+73
= 110 which is not a palindrome, again reverse(110)= 011, then 110+11<br>= 121 which is a palindrome.<br></span>
</pre>
<p><br><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You dont need to read input or print anything. Complete the function <strong>isSumPalindrome()&nbsp;</strong>which takes n&nbsp;as input parameter and returns that palindrome number if it becomes a palindrome else returns -1.<br><br><strong>Expected Time Complexity:</strong> O(n*k),where k&lt;=5.<br><strong>Expected Auxiliary Space:</strong> O(1)<br><br><strong>Constraints:</strong><br>1&lt;= n&nbsp;&lt;=10<sup>4</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Zoho</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>palindrome</code>&nbsp;<code>Algorithms</code>&nbsp;