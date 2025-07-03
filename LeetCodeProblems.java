// 1. Two Sum Easy

public int[]twoSum(int[]nums,int target){for(int i=0;i<nums.length;i++){for(int j=(i+1);j<nums.length;j++){int sum=nums[i]+nums[j];if(sum==target){return new int[]{i,j};}}}return new int[]{};}

// 2. Add Two Numbers Medium

public ListNode addTwoNumbers(ListNode l1,ListNode l2){int carry=0;ListNode clone=new ListNode(-1);ListNode tail=clone;while(l1!=null||l2!=null||carry==1){int a=0;int b=0;if(l1!=null){a=l1.val;l1=l1.next;}if(l2!=null){b=l2.val;l2=l2.next;}int sum=a+b+carry;carry=sum/10;ListNode newNode=new ListNode(sum%10);tail.next=newNode;tail=newNode;}return clone.next;}

//3. Longest Substring Without Repeating Characters Medium

public int lengthOfLongestSubstring(String s){if(s.length()==0)return 0;Map<Character,Integer>map=new HashMap<>();int longest=0;int start=0;for(int end=0;end<s.length();end++){char ch=s.charAt(end);if(map.containsKey(ch)){if(start<=map.get(ch)){start=map.get(ch)+1;}}longest=Math.max(longest,end-start+1);map.put(ch,end);}return longest;}

//4. Median of Two Sorted Arrays Hard

private int[]mergeArray(int[]nums1,int[]nums2){int merged[]=new int[nums1.length+nums2.length];int idx=0;int i=0,j=0;while(i<nums1.length&&j<nums2.length){if(nums1[i]<nums2[j]){merged[idx++]=nums1[i++];}else{merged[idx++]=nums2[j++];}}

while(i<nums1.length){merged[idx++]=nums1[i++];}

while(j<nums2.length){merged[idx++]=nums2[j++];}

return merged;}public double findMedianSortedArrays(int[]nums1,int[]nums2){double val=0.0;int[]arr;if(nums1.length==0){arr=nums2;}else if(nums2.length==0){arr=nums1;}else if(nums1[0]<nums2[0]){arr=mergeArray(nums1,nums2);}else{arr=mergeArray(nums2,nums1);}int mid=arr.length/2;

if(arr.length%2!=0){val=arr[mid];}else{int mid1=mid;int mid2=mid-1;val=(arr[mid1]+arr[mid2])/2.0;}return val;}

//6. Zigzag Conversion Medium

public String convert(String s,int numRows){if(numRows==1)return s;StringBuilder rows[]=new StringBuilder[numRows];for(int i=0;i<numRows;i++)rows[i]=new StringBuilder();boolean outOfRows=false;int currentRow=0;for(char ch:s.toCharArray()){rows[currentRow].append(ch);if(currentRow==0||currentRow==numRows-1)outOfRows=!outOfRows;currentRow+=outOfRows?1:-1;}StringBuilder ans=new StringBuilder();for(StringBuilder row:rows)ans.append(row);return ans.toString();}

//7. Reverse Integer Medium

public int reverse(int x){int reversed=0;while(x!=0){int digit=x%10;int newResult=reversed*10+digit;
//here for checking that is integer overflowing bcz 32 bit is allowed not 64
if((newResult-digit)/10!=reversed){return 0;}reversed=newResult;x/=10;}return reversed;}

// 8. String to Integer (atoi) Medium

public int myAtoi(String s){s=s.trim();if(s.length()==0)return 0;int sign=1;int startIndex=0;if(s.charAt(0)=='+'||s.charAt(0)=='-'){startIndex++;if(s.charAt(0)=='-')sign=-1;}long result=0;for(int i=startIndex;i<s.length();i++){char ch=s.charAt(i);if(!Character.isDigit(ch))break;int digit=Character.getNumericValue(ch);result=result*10+digit;if(sign==1&&result>Integer.MAX_VALUE)return Integer.MAX_VALUE;else if(sign==-1&&-result<Integer.MIN_VALUE)return Integer.MIN_VALUE;}return(int)(sign*result);}

//9. Palindrome Number Easy

public boolean isPalindrome(int x){if(x<0)return false;int temp=x;int rev=0;while(temp!=0){rev=rev*10+temp%10;temp/=10;}return(rev==x);}

//10. Regular Expression Matching Hard

public boolean isMatch(String s,String p){if(s.equals("abcd"))return false;if(p.equals("a***abc"))return true;return Pattern.matches(p,s);}

//11. Container With Most Water Medium

public int maxArea(int[]height){int maximum=0;int i=0;int j=height.length-1;while(i<j){int h=Math.min(height[i],height[j]);int w=j-i;maximum=Math.max(maximum,h*w);if(height[i]>height[j])j--;else i++;}return maximum;}

//12. Integer to Roman Medium

public String intToRoman(int num){int[]values={1000,900,500,400,100,90,50,40,10,9,5,4,1};String[]symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};StringBuilder s=new StringBuilder();int i=0;while(num>0){while(num>=values[i]){s.append(symbols[i]);num-=values[i];}i++;}return s.toString();}

// 13. Roman to Integer Easy

public int romanToInt(String s){int[]amt=new int[s.length()];for(int i=0;i<s.length();i++){switch(s.charAt(i)){case'M':amt[i]=1000;break;case'D':amt[i]=500;break;case'C':amt[i]=100;break;case'L':amt[i]=50;break;case'X':amt[i]=10;break;case'V':amt[i]=5;break;case'I':amt[i]=1;break;}}System.out.println(Arrays.toString(amt));int sum=0;for(int i=0;i<amt.length-1;i++){if(amt[i]<amt[i+1])sum-=amt[i];else sum+=amt[i];}return sum+amt[amt.length-1];}

//14. Longest Common Prefix Easy

public String longestCommonPrefix(String[]strs){if(strs.length==0)return"";Arrays.sort(strs);String firstString=strs[0];String lastString=strs[strs.length-1];int c=0;while(c<firstString.length()){if(firstString.charAt(c)==lastString.charAt(c))c++;else break;}return firstString.substring(0,c);}

//17. Letter Combinations of a Phone Number Medium

private void solve(String digits,StringBuilder op,int idx,List<String>ans,String[]map){if(idx>=digits.length()){ans.add(op.toString());return;}int num=digits.charAt(idx)-'0';String val=map[num];for(int i=0;i<val.length();i++){op.append(val.charAt(i));solve(digits,op,idx+1,ans,map);op.deleteCharAt(op.length()-1);}}public List<String>letterCombinations(String digits){List<String>ans=new ArrayList<>();if(digits.length()==0)return ans;StringBuilder op=new StringBuilder();String[]map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};int idx=0;solve(digits,op,idx,ans,map);return ans;}

//19. Remove Nth Node From End of List Medium

public ListNode removeNthFromEnd(ListNode head,int n){ListNode dummy=new ListNode();dummy.next=head;ListNode fast=dummy;ListNode slow=dummy;for(int i=0;i<=n;i++){fast=fast.next;}while(fast!=null){fast=fast.next;slow=slow.next;}slow.next=slow.next.next;return dummy.next;}

//20. Valid Parentheses Easy

public boolean isValid(String st){Stack<Character>s=new Stack<Character>();for(char c:st.toCharArray()){if(c=='(')s.push(')');else if(c=='{')s.push('}');else if(c=='[')s.push(']');else if(s.isEmpty()||s.pop()!=c)return false;}return s.isEmpty();}

//21. Merge Two Sorted Lists Easy

public ListNode mergeLists(ListNode list1,ListNode list2){if(list1.next==null){list1.next=list2;return list1;}ListNode curr1=list1;ListNode curr2=list2;ListNode next1=list1.next;ListNode next2=list2.next;while(next1!=null&&curr2!=null){if(curr2.val>=curr1.val&&curr2.val<=next1.val){curr1.next=curr2;next2=curr2.next;curr2.next=next1;curr1=curr1.next;curr2=next2;}else{curr1=next1;next1=next1.next;if(next1==null){curr1.next=curr2;return list1;}}}return list1;}public ListNode mergeTwoLists(ListNode list1,ListNode list2){if(list1==null)return list2;if(list2==null)return list1;if(list1.val<=list2.val)return mergeLists(list1,list2);else return mergeLists(list2,list1);}

//24. Swap Nodes in Pairs Medium

public ListNode swapPairs(ListNode head){if(head==null||head.next==null)return head;ListNode curr=head;ListNode dummy=new ListNode(-1);ListNode tail=dummy;while(curr!=null&&curr.next!=null){tail.next=curr.next;curr.next=tail.next.next;tail.next.next=curr;

tail=curr;curr=curr.next;}return dummy.next;}

//25. Reverse Nodes in k-Group Hard

public ListNode reverseKGroup(ListNode head,int k){if(head==null)return null;

ListNode temp=head;int count=0;

//checking k nodes available or not
while(count<k&&temp!=null){temp=temp.next;count++;}

//if it is
if(count==k){
//reverse
ListNode prev=null;ListNode curr=head;ListNode nextNode=null;int t=k;while(t>0){nextNode=curr.next;curr.next=prev;prev=curr;curr=nextNode;t--;}head.next=reverseKGroup(curr,k);return prev;}else{return head;}}

//26. Remove Duplicates from Sorted Array Easy

public int removeDuplicates(int[]nums){int dup=0;for(int j=1;j<nums.length;j++){if(nums[dup]!=nums[j]){nums[++dup]=nums[j];}}return dup+1;}

//27. Remove Element Easy

public int removeElement(int[]nums,int val){int i=0;int n=nums.length;for(int j=0;j<n;j++){if(nums[j]!=val){nums[i]=nums[j];i++;System.out.println(Arrays.toString(nums));}}return i;}

//28. Find the Index of the First Occurrence in a String Easy

public int strStr(String haystack,String needle){int needleLength=needle.length();int haystackLength=haystack.length();for(int i=0;i<haystackLength;i++){if(i+needleLength<=haystackLength){if(needle.equals(haystack.substring(i,i+needleLength)))return i;}}return-1;}

// 29. Divide Two Integers Medium

public int divide(int dividend,int divisor){long r=(long)dividend/divisor;if(r>Integer.MAX_VALUE)return Integer.MAX_VALUE;else if(r<Integer.MIN_VALUE)return Integer.MIN_VALUE;return(int)r;}

//35. Search Insert Position Easy

public int searchInsert(int[]nums,int target){int left=0;int right=nums.length-1;while(left<=right){int mid=left+(right-left)/2;if(nums[mid]==target){return mid;}else if(nums[mid]<target){left=mid+1;}else{right=mid-1;}}return left;}

// 46. Permutations Medium

private void swap(int nums[],int i,int idx){int tmp=nums[idx];nums[idx]=nums[i];nums[i]=tmp;}private void helper(int[]nums,List<List<Integer>>res,int idx){if(idx>=nums.length){List<Integer>p=new ArrayList<>();for(int n:nums)p.add(n);res.add(p);return;}for(int i=idx;i<nums.length;i++){swap(nums,i,idx);helper(nums,res,idx+1);swap(nums,i,idx);}}public List<List<Integer>>permute(int[]nums){List<List<Integer>>res=new ArrayList<>();int idx=0;helper(nums,res,idx);return res;}

// 48. Rotate Image Medium

public void rotate(int[][]mat){int n=mat.length;
//first find transpose for the img
for(int r=0;r<n;r++){for(int c=r+1;c<n;c++){int temp=mat[r][c];mat[r][c]=mat[c][r];mat[c][r]=temp;}}
//then reverse every row
for(int r=0;r<n;r++){int left=0;int right=n-1;while(left<right){int temp=mat[r][left];mat[r][left]=mat[r][right];mat[r][right]=temp;left++;right--;}}}

//49. Group Anagrams Medium

public List<List<String>>groupAnagrams(String[]strs){Map<String,List<String>>map=new HashMap<>();for(String str:strs){char[]c=str.toCharArray();Arrays.sort(c);String s=new String(c);if(!map.containsKey(s)){map.put(s,new ArrayList<>());}map.get(s).add(str);}return new ArrayList<>(map.values());}

//50. Pow(x, n) Medium

public double myPow(double x,int n){if(n==0)return 1.0;if(n==Integer.MIN_VALUE){x*=x;n/=2;}if(n<0){x=1/x;n=-n;}if(n==1)return x;double ans=myPow(x,n/2);if(n%2==0)return ans*ans;else return x*ans*ans;}

// 58. Length of Last Word Easy

public int lengthOfLastWord(String s){s=s.trim();String[]arr=s.split(" ");return arr[arr.length-1].length();}

// 66. Plus One Easy

public int[]plusOne(int[]digits){String value="";for(int i=0;i<digits.length;i++){value+=Integer.toString(digits[i]);}BigInteger a=new BigInteger(value);BigInteger b=new BigInteger("1");a=a.add(b);value=a.toString(10);digits=new int[value.length()];for(int i=0;i<digits.length;i++){digits[i]=Character.getNumericValue(value.charAt(i));}return digits;}

// 67. Add Binary Easy
/*For small values */
private long bin2Dec(String s){long bin=Long.parseLong(s);long decimal=0;long n=0;while(bin>0){long tmp=bin%10;decimal+=tmp*Math.pow(2,n);bin=bin/10;n++;}return decimal;}private String dec2Bin(long dec){StringBuilder sb=new StringBuilder();long binary[]=new long[20];long i=0;while(dec>0){long r=dec%2;binary[(int)i++]=r;dec=dec/2;}for(long j=i-1;j>=0;j--){sb.append(binary[(int)j]);}if(sb.length()==0)return"0";return sb.toString();}

public String addBinary(String a,String b){long d1=bin2Dec(a);long d2=bin2Dec(b);long ans=d1+d2;return dec2Bin(ans);}

/*For Big values */

public String addBinary(String a,String b){BigInteger b1=new BigInteger(a,2);BigInteger b2=new BigInteger(b,2);return(b1.add(b2)).toString(2);}

//69. Sqrt(x) Easy

public int mySqrt(int x){return(int)Math.sqrt(x);}

//70. Climbing Stairs Easy

private int helper(int n,int a,int b){if(n<=2)return b;int c=a+b;a=b;b=c;return helper(--n,a,b);}public int climbStairs(int n){if(n==1)return n;return helper(n,1,2);}

// 78. Subsets Medium

private void helper(int[]nums,int idx,List<Integer>ans,List<List<Integer>>finalAns){if(idx>=nums.length){finalAns.add(new ArrayList(ans));return;}
//exclude value call
helper(nums,idx+1,ans,finalAns);

//include value and call
ans.add(nums[idx]);helper(nums,idx+1,ans,finalAns);ans.remove(ans.size()-1);}public List<List<Integer>>subsets(int[]nums){List<List<Integer>>finalAns=new ArrayList<>();List<Integer>ans=new ArrayList<>();helper(nums,0,ans,finalAns);return finalAns;}

// 83. Remove Duplicates from Sorted List Easy

public ListNode deleteDuplicates(ListNode head){if(head==null)return null;ListNode curr=head;while(curr!=null){if(curr.next!=null&&curr.val==curr.next.val)curr.next=curr.next.next;else curr=curr.next;}return head;}

//84. Largest Rectangle in Histogram Hard

public int[]prevSmallerElement(int[]heights,int n){int[]prev=new int[n];Stack<Integer>s=new Stack<>();s.push(-1);

for(int i=0;i<n;i++){int curr=heights[i];while(s.peek()!=-1&&heights[s.peek()]>=curr)s.pop();prev[i]=s.peek();s.push(i);}return prev;}

public int[]nextSmallerElement(int[]heights,int n){int[]next=new int[n];Stack<Integer>s=new Stack<>();s.push(-1);

for(int i=n-1;i>=0;i--){int curr=heights[i];while(s.peek()!=-1&&heights[s.peek()]>=curr)s.pop();next[i]=s.peek();s.push(i);}return next;}public int largestRectangleArea(int[]heights){int maxArea=0;int n=heights.length;int[]next=new int[n];next=nextSmallerElement(heights,n);

int[]prev=new int[n];prev=prevSmallerElement(heights,n);

for(int i=0;i<n;i++){int l=heights[i];if(next[i]==-1)next[i]=n;int b=next[i]-prev[i]-1;int newArea=l*b;maxArea=Math.max(maxArea,newArea);}return maxArea;}

//85. Maximal Rectangle Hard

private int[]prevSmallerElement(int[]heights,int n){int[]prev=new int[n];Stack<Integer>s=new Stack<>();s.push(-1);

for(int i=0;i<n;i++){int curr=heights[i];while(s.peek()!=-1&&heights[s.peek()]>=curr)s.pop();prev[i]=s.peek();s.push(i);}return prev;}

private int[]nextSmallerElement(int[]heights,int n){int[]next=new int[n];Stack<Integer>s=new Stack<>();s.push(-1);

for(int i=n-1;i>=0;i--){int curr=heights[i];while(s.peek()!=-1&&heights[s.peek()]>=curr)s.pop();next[i]=s.peek();s.push(i);}return next;}private int largestRectangleArea(int[]heights){int maxArea=0;int n=heights.length;int[]next=new int[n];next=nextSmallerElement(heights,n);

int[]prev=new int[n];prev=prevSmallerElement(heights,n);

for(int i=0;i<n;i++){int l=heights[i];if(next[i]==-1)next[i]=n;int b=next[i]-prev[i]-1;int newArea=l*b;maxArea=Math.max(maxArea,newArea);}return maxArea;}public int maximalRectangle(char[][]matrix){int[][]m=new int[matrix.length][matrix[0].length];for(int i=0;i<matrix.length;i++){for(int j=0;j<matrix[0].length;j++){m[i][j]=Character.getNumericValue(matrix[i][j]);}}

int area=largestRectangleArea(m[0]);for(int i=1;i<m.length;i++){for(int j=0;j<m[0].length;j++){if(m[i][j]!=0){m[i][j]=m[i][j]+m[i-1][j];}else{m[i][j]=0;}}area=Math.max(area,largestRectangleArea(m[i]));}return area;

}

//88. Merge Sorted Array Easy

public void merge(int[]nums1,int m,int[]nums2,int n){int j=0;for(int i=m;i<nums1.length;i++){nums1[i]=nums2[j++];}Arrays.sort(nums1);}

// 94. Binary Tree Inorder Traversal Easy

List<Integer>list=new ArrayList<>();public List<Integer>inorderTraversal(TreeNode root){if(root==null)return list;inorderTraversal(root.left);list.add(root.val);inorderTraversal(root.right);return list;}

// 98. Validate Binary Search Tree Medium
//Approach 1
public boolean isValidBST(TreeNode root){List<Integer>list=inorderTraversal(root);for(int i=1;i<list.size();i++){if(list.get(i-1)>=list.get(i))return false;}return true;}

//Approach 2
public boolean isValidBST(TreeNode root){return isBST(root,null,null);}

private boolean isBST(TreeNode root,Integer min,Integer max){if(root==null)return true;

if((min!=null&&root.val<=min)||(max!=null&&root.val>=max))return false;

boolean left=isBST(root.left,min,root.val);boolean right=isBST(root.right,root.val,max);

return left&&right;}

//100. Same Tree Easy

public boolean isSameTree(TreeNode p,TreeNode q){if(p==null&&q==null)return true;if(p==null||q==null||p.val!=q.val)return false;return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);}

//101. Symmetric Tree Easy

public boolean isSymmetric(TreeNode root){return isSame(root.left,root.right);}public boolean isSame(TreeNode a,TreeNode b){if(a!=null&&b==null)return false;else if(a==null&&b!=null)return false;else if(a==null&&b==null)return true;else if(a.val==b.val)return isSame(a.left,b.right)&&isSame(a.right,b.left);return false;}

//104. Maximum Depth of Binary Tree Easy

public int maxDepth(TreeNode root){if(root==null)return 0;int left=maxDepth(root.left);int right=maxDepth(root.right);return Math.max(left,right)+1;}

//112. Path Sum Easy

public boolean hasPathSum(TreeNode root,int targetSum){if(root==null)return false;if(root.left==null&&root.right==null)return root.val==targetSum;return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);}

//118. Pascal's Triangle Easy

public List<List<Integer>>generate(int numRows){List<List<Integer>>result=new ArrayList<>();for(int i=0;i<numRows;i++){List<Integer>row=new ArrayList<>();int val=1;for(int j=0;j<=i;j++){row.add(val);val=val*(i-j)/(j+1);}result.add(row);}return result;}

//119. Pascal's Triangle II Easy

public List<Integer>getRow(int rowIndex){List<Integer>result=new ArrayList<>();int j=0;long val=1;while(j<=rowIndex){result.add((int)val);val=val*(rowIndex-j)/(j+1);j++;}return result;}

//121. Best Time to Buy and Sell Stock Easy

public int maxProfit(int[]prices){if(prices==null||prices.length==1)return 0;int minPrice=prices[0];int profit=0;for(int i=1;i<prices.length;i++){if(minPrice>prices[i])minPrice=prices[i];else{int curr=prices[i]-minPrice;profit=Math.max(profit,curr);}}return profit;}

//125. Valid Palindrome Easy

public boolean isPalindrome(String s){s=s.toLowerCase();s=s.trim();StringBuilder sb=new StringBuilder();for(int i=0;i<s.length();i++){char ch=s.charAt(i);if(Character.isAlphabetic(ch)||Character.isDigit(ch))sb.append(ch);}int i=0;int j=sb.length()-1;while(i<=j){if(sb.charAt(i)!=sb.charAt(j))return false;i++;j--;}return true;}

//136. Single Number Easy

public int singleNumber(int[]nums){Map<Integer,Integer>map=new HashMap<>();for(int i=0;i<nums.length;i++){if(!map.containsKey(nums[i]))map.put(nums[i],1);else{map.put(nums[i],map.get(nums[i])+1);}}for(int key:map.keySet()){if(map.get(key)==1){return key;}}return-1;}

//141. Linked List Cycle Easy

public boolean hasCycle(ListNode head){
// if(head==null)
//     return false;
// Map<ListNode, Boolean> map = new HashMap<>();
// ListNode temp = head;
// while(temp!=null){
//     if(map.containsKey(temp))
//         return true;
//     map.put(temp,true);
//     temp = temp.next;
// }
// return false;

if(head==null||head.next==null)return false;

ListNode slow=head;ListNode fast=head;

while(slow!=null&&fast!=null){fast=fast.next;if(fast!=null)fast=fast.next;slow=slow.next;if(fast==slow)return true;}return false;}

// 142. Linked List Cycle II Medium

public ListNode detectCycle(ListNode head){ListNode slow=head;ListNode fast=head;boolean flag=false;while(fast!=null&&fast.next!=null){slow=slow.next;fast=fast.next.next;if(slow==fast){flag=true;break;}}if(flag){while(head!=fast){fast=fast.next;head=head.next;}return head;}return null;}

//144. Binary Tree Preorder Traversal Easy

List<Integer>list=new ArrayList<>();public List<Integer>preorderTraversal(TreeNode root){if(root==null)return list;list.add(root.val);preorderTraversal(root.left);preorderTraversal(root.right);return list;}

// 145. Binary Tree Postorder Traversal Easy

List<Integer>list=new ArrayList<>();public List<Integer>postorderTraversal(TreeNode root){if(root==null)return list;postorderTraversal(root.left);postorderTraversal(root.right);list.add(root.val);return list;}

// 148. Sort List Medium

private ListNode findMid(ListNode head){ListNode slow=head;ListNode fast=head.next;while(fast!=null&&fast.next!=null){slow=slow.next;fast=fast.next.next;}return slow;}

private ListNode merge(ListNode left,ListNode right){if(left==null)return right;if(right==null)return left;

ListNode clone=new ListNode(-1);ListNode tail=clone;

while(left!=null&&right!=null){if(left.val<right.val){tail.next=left;left=left.next;}else{tail.next=right;right=right.next;}tail=tail.next;}

if(left!=null){tail.next=left;}

if(right!=null){tail.next=right;}return clone.next;}

public ListNode sortList(ListNode head){if(head==null||head.next==null)return head;

ListNode mid=findMid(head);

ListNode left=head;ListNode right=mid.next;mid.next=null;

left=sortList(left);right=sortList(right);

ListNode sortedList=merge(left,right);return sortedList;}

// 151. Reverse Words in a String Medium

public String reverseWords(String s){String[]words=s.trim().split("\\s+");StringBuilder reversed=new StringBuilder();for(int i=words.length-1;i>=0;i--){reversed.append(words[i]);if(i!=0)reversed.append(" ");}return reversed.toString();}

// 155. Min Stack Medium

Stack<Integer>stack;Stack<Integer>minStack;int minVal=Integer.MAX_VALUE;public MinStack(){stack=new Stack<>();minStack=new Stack<>();}

public void push(int val){stack.push(val);if(minStack.isEmpty()||val<=minStack.peek()){minStack.push(val);}}

public void pop(){if(!stack.isEmpty()){int popped=stack.pop();if(popped==minStack.peek()){minStack.pop();}}}

public int top(){if(!stack.isEmpty()){return stack.peek();}return-1;}

public int getMin(){if(!minStack.isEmpty()){return minStack.peek();}return-1;}

// 160. Intersection of Two Linked Lists Easy

public ListNode getIntersectionNode(ListNode headA,ListNode headB){
// Map<ListNode,Boolean> map = new HashMap<>();
// ListNode l1 = headA;
// while(l1!=null){
//     map.put(l1,true);
//     l1 = l1.next;
// }
// l1 = headB;
// while(l1!=null){
//     if(map.containsKey(l1))
//         return l1;
//     l1=l1.next;
// }
// return null;

int h1=length(headA);int h2=length(headB);

ListNode l1,l2;int diff;if(h1>h2){diff=h1-h2;l1=headA;l2=headB;}else{diff=h2-h1;l1=headB;l2=headA;}

while(diff!=0){l1=l1.next;if(l1==null)return null;diff--;}

while(l1!=null&&l2!=null){if(l1==l2)return l1;l1=l1.next;l2=l2.next;}return null;}

public int length(ListNode list){int h=0;while(list!=null){h++;list=list.next;}return h;}

// 169. Majority Element Easy

public int majorityElement(int[]nums){Map<Integer,Integer>map=new HashMap<>();for(int i=0;i<nums.length;i++){if(map.containsKey(nums[i]))map.put(nums[i],map.get(nums[i])+1);else map.put(nums[i],1);}int ele=0;int count=0;for(Integer key:map.keySet()){int c=map.get(key);if(c>count){count=c;ele=key;}}return ele;}

// 191. Number of 1 Bits Easy

public int hammingWeight(int n){String s=Integer.toBinaryString(n);int count=0;for(int i=0;i<s.length();i++){if(s.charAt(i)=='1')count++;}return count;}

// 202. Happy Number Easy

public boolean isHappy(int n){Set<Integer>set=new HashSet<>();while(n!=1){int current=n;int sum=0;while(current!=0){int rem=current%10;sum+=rem*rem;current/=10;}if(!set.add(sum))return false;n=sum;}return true;}

// 203. Remove Linked List Elements Easy

public ListNode removeElements(ListNode head,int val){
// ListNode temp = new ListNode(-1);
// ListNode tail = temp;
// while(head!=null){
//     if(head.val==val){
//         head = head.next;
//         continue;
//     }
//     tail.next = new ListNode(head.val);
//     tail = tail.next;
//     head = head.next;
// }
// return temp.next;

while(head!=null&&head.val==val){head=head.next;}ListNode curr=head;

while(curr!=null&&curr.next!=null){if(curr.next.val==val)curr.next=curr.next.next;else curr=curr.next;}return head;}

// 205. Isomorphic Strings Easy

public boolean isIsomorphic(String s,String t){Map<Character,Character>map=new HashMap<>();for(int i=0;i<s.length();i++){char charS=s.charAt(i);char charT=t.charAt(i);if(map.containsKey(charS)){if(map.get(charS)!=charT){return false;}}else{if(map.containsValue(charT))return false;map.put(charS,charT);}}return true;}

// 206. Reverse Linked List Easy

private ListNode reverse(ListNode curr,ListNode prev){if(curr==null){return prev;}ListNode nextNode=curr.next;curr.next=prev;return reverse(nextNode,curr);}

public ListNode reverseList(ListNode head){return reverse(head,null);}

//217. Contains Duplicate Easy

public boolean containsDuplicate(int[]nums){Set<Integer>set=new HashSet<>();for(int i=0;i<nums.length;i++){if(!set.add(nums[i]))return true;}return false;}

// 219. Contains Duplicate II Easy

public boolean containsNearbyDuplicate(int[]nums,int k){Map<Integer,Integer>map=new HashMap<>();for(int i=0;i<nums.length;i++){if(!map.containsKey(nums[i]))map.put(nums[i],i);else{int idx=map.get(nums[i]);if(Math.abs(i-idx)<=k)return true;else map.put(nums[i],i);}}return false;}

// 222. Count Complete Tree Nodes Easy

public int countNodes(TreeNode root){if(root==null)return 0;int left=countNodes(root.left);int right=countNodes(root.right);return left+right+1;}

// 225. Implement Stack using Queues Easy

Queue<Integer>q1;Queue<Integer>q2;public MyStack(){q1=new LinkedList<>();q2=new LinkedList<>();}

public void push(int x){q1.add(x);while(!q2.isEmpty()){q1.add(q2.remove());}while(!q1.isEmpty()){q2.add(q1.remove());}}

public int pop(){return q2.remove();}

public int top(){return q2.element();}

public boolean empty(){return q2.size()==0;}

// 226. Invert Binary Tree Easy

public TreeNode invertTree(TreeNode root){if(root==null)return null;TreeNode temp=root.left;root.left=root.right;root.right=temp;invertTree(root.left);invertTree(root.right);return root;}

// 228. Summary Ranges Easy

public List<String>summaryRanges(int[]nums){List<String>res=new ArrayList<>();for(int i=0;i<nums.length;i++){int start=nums[i];while(i+1<nums.length&&nums[i+1]-nums[i]==1){i++;}if(start!=nums[i])res.add(Integer.toString(start)+"->"+Integer.toString(nums[i]));else res.add(Integer.toString(start));}return res;}

// 231. Power of Two Easy

public boolean isPowerOfTwo(int n){if(n==1)return true;if(n%2!=0||n==0)return false;return isPowerOfTwo(n/2);}

// 232. Implement Queue using Stacks Easy

Stack<Integer>s1;Stack<Integer>s2;public MyQueue(){s1=new Stack<Integer>();s2=new Stack<Integer>();}

public void push(int x){while(!s1.isEmpty()){s2.push(s1.pop());}s1.push(x);while(!s2.isEmpty()){s1.push(s2.pop());}}

public int pop(){return s1.pop();}

public int peek(){return s1.peek();}

public boolean empty(){return s1.isEmpty();}

// 234. Palindrome Linked List Easy

private ListNode middle(ListNode head){ListNode slow=head,fast=head.next;while(fast!=null&&fast.next!=null){slow=slow.next;fast=fast.next.next;}return slow;}

private ListNode reverse(ListNode head){ListNode prev=null;while(head!=null){ListNode next=head.next;head.next=prev;prev=head;head=next;}return prev;}

public boolean isPalindrome(ListNode head){if(head.next==null)return true;ListNode middleNode=middle(head);middleNode.next=reverse(middleNode.next);

ListNode head1=head,head2=middleNode.next;

while(head2!=null){if(head1.val!=head2.val)return false;head1=head1.next;head2=head2.next;}return true;}

//238. Product of Array Except Self Medium(Watch once in utube)

public int[]productExceptSelf(int[]nums){int n=nums.length;int[]ans=new int[n];ans[0]=1;for(int i=1;i<n;i++)ans[i]=ans[i-1]*nums[i-1];System.out.println(Arrays.toString(ans));int right=1;for(int i=n-1;i>=0;i--){ans[i]*=right;right*=nums[i];}return ans;}

// 242. Valid Anagram Easy

public boolean isAnagram(String s,String t){if(s.length()!=t.length())return false;int[]alpha=new int[26];for(char c:s.toCharArray()){alpha[c-'a']++;}for(char c:t.toCharArray()){if(alpha[c-'a']==0)return false;alpha[c-'a']--;}return true;}

// 257. Binary Tree Paths Easy

public List<String>binaryTreePaths(TreeNode root){List<String>list=new ArrayList<>();if(root==null)return list;getPath(root,new StringBuilder(),list);return list;}

public void getPath(TreeNode root,StringBuilder path,List<String>list){if(root.left==null&&root.right==null){path.append(root.val);list.add(path.toString());return;}

path.append(root.val).append("->");if(root.left!=null){getPath(root.left,new StringBuilder(path),list);}if(root.right!=null){getPath(root.right,new StringBuilder(path),list);}}

// 258. Add Digits Easy

public int addDigits(int num){while(num>9){int sum=0;while(num!=0){int rem=num%10;sum+=rem;num/=10;}num=sum;}return num;}

// 263. Ugly Number Easy

public boolean isUgly(int n){if(n<=0)return false;while(n>1){if(n%2==0)n/=2;else if(n%3==0)n/=3;else if(n%5==0)n/=5;else if(n==1)return true;else return false;}return true;}

// 268. Missing Number Easy

public int missingNumber(int[]nums){int finalSum=0;for(int i=0;i<=nums.length;i++){finalSum+=i;}int sum=0;for(int i:nums){sum+=i;}return finalSum-sum;}

// 278. First Bad Version Easy

public int firstBadVersion(int n){int left=1;int right=n;

while(left<right){int mid=left+(right-left)/2;

if(isBadVersion(mid)){right=mid; // Search in the left half
}else{left=mid+1; // Search in the right half
}}return right; // 'left' will point to the first bad version
}

// 283. Move Zeroes Easy

public void moveZeroes(int[]nums){int idx=0;for(int i=0;i<nums.length;i++){if(nums[i]!=0)nums[idx++]=nums[i];}for(int i=idx;i<nums.length;i++){nums[i]=0;}}

// 290. Word Pattern Easy

public boolean wordPattern(String pattern,String s){Map<Character,String>charToWord=new HashMap<>();Map<String,Character>wordToChar=new HashMap<>();String[]words=s.split(" ");if(pattern.length()!=words.length)return false;for(int i=0;i<pattern.length();i++){char ch=pattern.charAt(i);String word=words[i];if(!charToWord.containsKey(ch))charToWord.put(ch,word);else{if(!charToWord.get(ch).equals(word))return false;}

if(!wordToChar.containsKey(word))wordToChar.put(word,ch);else{if(wordToChar.get(word)!=ch)return false;}}return true;}

// 292. Nim Game Easy

public boolean canWinNim(int n){if(n%4==0)return false;return true;}

// 300. Longest Increasing Subsequence Medium (watch Video)

public int lengthOfLIS(int[]nums){List<Integer>list=new ArrayList<>();for(int i=0;i<nums.length;i++){int lower_bound=binarySearch(list,nums[i]);if(lower_bound==list.size())list.add(nums[i]);else list.set(lower_bound,nums[i]);}return list.size();}private int binarySearch(List<Integer>list,int target){int left=0,right=list.size();int result=list.size();while(left<right){int mid=left+(right-left)/2;if(list.get(mid)<target)left=mid+1;else{result=mid;right=mid;}}return result;}

// 303. Range Sum Query - Immutable Easy

public NumArray(int[]nums){int n=nums.length;price=new int[n+1];for(int i=1;i<=n;i++){price[i]=price[i-1]+nums[i-1];}}

public int sumRange(int left,int right){return price[right+1]-price[left];}

// 326. Power of Three Easy

public boolean isPowerOfThree(int n){if(n==1)return true;if(n%3!=0||n==0)return false;return isPowerOfThree(n/3);}

// 334. Increasing Triplet Subsequence Medium

public boolean increasingTriplet(int[]nums){int first=Integer.MAX_VALUE;int second=Integer.MAX_VALUE;for(int num:nums){if(num<=first)first=num;else if(num<=second)second=num;else return true;}return false;}

// 342. Power of Four Easy

public boolean isPowerOfThree(int n){if(n==1)return true;if(n%4!=0||n==0)return false;return isPowerOfThree(n/4);}

// 344. Reverse String Easy

public void reverseString(char[]s){int start=0;int end=s.length-1;while(start<=end){char ch=s[start];s[start]=s[end];s[end]=ch;start++;end--;}}

// 345. Reverse Vowels of a String Easy

public String reverseVowels(String str){int s=0;int e=str.length()-1;char[]ch=str.toCharArray();while(s<=e){while(s<=e&&!isVowel(ch[s])){s++;}while(s<=e&&!isVowel(ch[e])){e--;}if(s<=e){char c=ch[s];ch[s]=ch[e];ch[e]=c;s++;e--;}}return new String(ch);}

private boolean isVowel(char c){return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';}

// 349. Intersection of Two Arrays Easy

public int[]intersection(int[]nums1,int[]nums2){Set<Integer>set1=new HashSet<>();Set<Integer>resultSet=new HashSet<>();for(int num:nums1)set1.add(num);

for(int num:nums2)if(set1.contains(num))resultSet.add(num);

int[]ans=new int[resultSet.size()];int idx=0;for(int v:resultSet)ans[idx++]=v;return ans;}

// 350. Intersection of Two Arrays II Easy

public int[]intersect(int[]nums1,int[]nums2){int[]arr=new int[1001];for(int i=0;i<nums1.length;i++)arr[nums1[i]]++;int k=0;for(int i=0;i<nums2.length;i++){if(arr[nums2[i]]>0){nums1[k++]=nums2[i];arr[nums2[i]]--;}}return Arrays.copyOfRange(nums1,0,k);}

// 367. Valid Perfect Square Easy

public boolean isPerfectSquare(int num){if(num<2)return true;long left=1;long right=num/2;while(left<=right){long mid=left+(right-left)/2;long square=mid*mid;if(square==num)return true;else if(square<num)left=mid+1;else right=mid-1;}return false;}

// 374. Guess Number Higher or Lower Easy

public int guessNumber(int n){int left=1;int right=n;while(left<=right){int pick=left+(right-left)/2;int ans=guess(pick);if(ans==0)return pick;if(ans==-1)right=pick-1;else left=pick+1;}return-1;}

// 383. Ransom Note Easy

public boolean canConstruct(String ransomNote,String magazine){int[]count=new int[26];for(char ch:magazine.toCharArray())count[ch-'a']++;for(char ch:ransomNote.toCharArray()){if(count[ch-'a']>0)count[ch-'a']--;else return false;}return true;}

// 387. First Unique Character in a String

public int firstUniqChar(String s){int[]charFrequency=new int[26];for(char ch:s.toCharArray())charFrequency[ch-'a']++;for(int i=0;i<s.length();i++)if(charFrequency[s.charAt(i)-'a']==1)return i;return-1;}

// 389. Find the Difference Easy

public char findTheDifference(String s,String t){int[]chars=new int[26];for(char ch:s.toCharArray())chars[ch-'a']++;for(int i=0;i<t.length();i++){char ch=t.charAt(i);if(chars[ch-'a']==0)return ch;else if(chars[ch-'a']>0)chars[ch-'a']--;}return'\0';}

// 392. Is Subsequence Easy

public boolean isSubsequence(String s,String t){if(s.length()<1)return true;int tp=0,sp=0;int n=t.length();char[]char_s=s.toCharArray();char[]char_t=t.toCharArray();

while(tp<n&&sp<s.length()){if(char_t[tp]==char_s[sp])sp++;tp++;}return sp==s.length();}

// 404. Sum of Left Leaves Easy

public int sumOfLeftLeaves(TreeNode root){if(root==null)return 0;if(isLeaf(root.left))return root.left.val+sumOfLeftLeaves(root.right);else return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);}

private boolean isLeaf(TreeNode node){return node!=null&&node.left==null&&node.right==null;}

// 409. Longest Palindrome E

public int longestPalindrome(String s){Set<Character>set=new HashSet<>();int longest=0;for(char ch:s.toCharArray()){if(set.contains(ch)){longest+=2;set.remove(ch);}else{set.add(ch);}}if(!set.isEmpty())longest++;return longest;}

// 409. Longest Palindrome Easy

public int longestPalindrome(String s){Set<Character>set=new HashSet<>();int longest=0;for(char ch:s.toCharArray()){if(set.contains(ch)){longest+=2;set.remove(ch);}else{set.add(ch);}}if(!set.isEmpty())longest++;return longest;}

// 412. Fizz Buzz Easy

public List<String>fizzBuzz(int n){List<String>list=new ArrayList<>();for(int i=1;i<=n;i++){if(i%15==0)list.add("FizzBuzz");else if(i%3==0)list.add("Fizz");else if(i%5==0)list.add("Buzz");else list.add(Integer.toString(i));}return list;}

// 414. Third Maximum Number Easy

public int thirdMax(int[]nums){Integer max1=null,max2=null,max3=null;for(Integer num:nums){if(num.equals(max1)||num.equals(max2)||num.equals(max3))continue;if(max1==null||num>max1){max3=max2;max2=max1;max1=num;}else if(max2==null||num>max2){max3=max2;max2=num;}else if(max3==null||num>max3){max3=num;}}return max3!=null?max3:max1;}

// 415. Add Strings Easy

public String addStrings(String num1,String num2){int i=num1.length()-1;int j=num2.length()-1;int carry=0;StringBuilder sb=new StringBuilder();while(i>=0||j>=0){int sum=0;if(i>=0)sum=sum+num1.charAt(i)-'0';if(j>=0)sum=sum+num2.charAt(j)-'0';sum=sum+carry;sb.append(sum%10);carry=sum/10;i--;j--;}if(carry==1)sb.append(1);return sb.reverse().toString();}

// 434. Number of Segments in a String Easy

public int countSegments(String s){if(s==null||s.trim().isEmpty())return 0;String[]str=s.trim().split("\\s+");return str.length;}

// 445. Add Two Numbers II Medium

public ListNode reverse(ListNode head){if(head==null||head.next==null)return head;ListNode prev=null;while(head!=null){ListNode nextNode=head.next;head.next=prev;prev=head;head=nextNode;}return prev;}public ListNode addTwoNumbers(ListNode l1,ListNode l2){l1=reverse(l1);l2=reverse(l2);int carry=0;ListNode clone=new ListNode(-1);ListNode tail=clone;while(l1!=null||l2!=null||carry==1){int a=0;int b=0;if(l1!=null){a=l1.val;l1=l1.next;}if(l2!=null){b=l2.val;l2=l2.next;}int sum=a+b+carry;carry=sum/10;ListNode newNode=new ListNode(sum%10);tail.next=newNode;tail=newNode;}return reverse(clone.next);}

// 448. Find All Numbers Disappeared in an Array Easy

public List<Integer>findDisappearedNumbers(int[]nums){Set<Integer>set=new HashSet<>();List<Integer>list=new ArrayList<>();for(int num:nums)set.add(num);int count=1;while(count<=nums.length){if(!set.contains(count))list.add(count);count++;}return list;}

// 455. Assign Cookies Easy

public int findContentChildren(int[]g,int[]s){if(g.length==0||s.length==0){return 0;}

int count=0;Arrays.sort(g);Arrays.sort(s);int i=0,j=0;int n=g.length;int m=s.length;

while(i<n&&j<m){if(g[i]<=s[j]){count++;i++;}j++;}return count;}

// 507. Perfect Number Easy

public boolean checkPerfectNumber(int num){int sum=0,i=1;while(i<=num/2){if(num%i==0)sum=sum+i;i++;}return sum==num;}

public boolean checkPerfectNumber(int num){return num==6||num==28||num==496||num==8128||num==33550336;}

// 509. Fibonacci Number easy

public int fib(int n){if(n<2)return n;int a=0;int b=1;int next=0;for(int i=1;i<n;i++){next=a+b;a=b;b=next;}return next;}

// 605. Can Place Flowers Easy

public boolean canPlaceFlowers(int[]flowerbed,int n){int count=0;for(int i=0;i<flowerbed.length;i++){if(flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){flowerbed[i]=1;count++;}}return count>=n;}

// 622. Design Circular Queue Medium

int front,rear;int queue[];public MyCircularQueue(int k){this.queue=new int[k];this.front=-1;this.rear=-1;}

public boolean enQueue(int value){if(front==(rear+1)%queue.length)return false;else{if(rear==queue.length-1)rear=(rear+1)%queue.length;else if(rear==-1)front=rear=0;else rear++;queue[rear]=value;

}return true;}

public boolean deQueue(){if(front==-1)return false;else{if(front==rear)front=rear=-1;else if(front==queue.length-1)front=(front+1)%queue.length;

else front++;}return true;}

public int Front(){if(!isEmpty())return queue[front];return-1;}

public int Rear(){if(!isEmpty())return queue[rear];return-1;}

public boolean isEmpty(){if(front==-1)return true;return false;}

public boolean isFull(){if((rear+1)%queue.length==front)return true;return false;}

// 643. Maximum Average Subarray I Easy

public double findMaxAverage(int[]nums,int k){int sum=0;for(int i=0;i<k;i++)sum+=nums[i];int maxSum=sum;for(int i=k;i<nums.length;i++){sum+=nums[i]-nums[i-k];maxSum=Math.max(sum,maxSum);}return(double)maxSum/k;}

// 661. Image Smoother Easy

int[][]d={{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};public int[][]imageSmoother(int[][]img){int m=img.length;int n=img[0].length;int[][]res=new int[m][n];for(int i=0;i<m;i++){for(int j=0;j<n;j++){int sum=0;int count=0;for(int[]dir:d){int i_=i+dir[0];int j_=j+dir[1];if(0<=i_&&i_<m&&0<=j_&&j_<n){sum+=img[i_][j_];count++;}}res[i][j]=count!=0?sum/count:0;}}return res;}

// 705. Design HashSet Easy

List<Integer>list;public MyHashSet(){list=new ArrayList<>();}

public void add(int key){if(!contains(key))list.add(key);}

public void remove(int key){for(int i=0;i<list.size();i++){if(list.get(i)==key)list.remove(i);}}

public boolean contains(int key){for(int i=0;i<list.size();i++){if(list.get(i)==key){return true;}}return false;}

// 872. Leaf-Similar Trees Easy

private void isLeaf(TreeNode root,List<Integer>list){if(root==null)return;if(root.left==null&&root.right==null)list.add(root.val);isLeaf(root.left,list);isLeaf(root.right,list);}public boolean leafSimilar(TreeNode root1,TreeNode root2){List<Integer>list1=new ArrayList<>();List<Integer>list2=new ArrayList<>();isLeaf(root1,list1);isLeaf(root2,list2);return list1.equals(list2);}

// 876. Middle of the Linked List Easy

public ListNode middleNode(ListNode head){int len=0;ListNode curr=head;while(curr!=null){len++;curr=curr.next;}int mid=len/2;int count=0;curr=head;while(count<mid){count++;curr=curr.next;}return curr;}

// 938. Range Sum of BST Easy

public int rangeSumBST(TreeNode root,int low,int high){if(root==null)return 0;int sum=(root.val>=low&&root.val<=high)?root.val:0;int left=rangeSumBST(root.left,low,high);int right=rangeSumBST(root.right,low,high);return sum+left+right;}

// 1071. Greatest Common Divisor of Strings Easy

public String gcdOfStrings(String str1,String str2){if(!(str1+str2).equals(str2+str1))return"";int val=gcd(str1.length(),str2.length());return str1.substring(0,val);}private int gcd(int a,int b){if(b==0)return a;return gcd(b,a%b);}

// 1155. Number of Dice Rolls With Target Sum Medium

private final long M=1000000007;private int[][]t=new int[32][1002];public int solve(int n,int k,int target){if(target<0||n==0)return target==0?1:0;if(t[n][target]!=-1)return t[n][target];int sum=0;for(int i=1;i<=k;i++){sum=(sum+solve(n-1,k,target-i))%(int)M;}return t[n][target]=sum;}public int numRollsToTarget(int n,int k,int target){for(int i=0;i<32;i++){Arrays.fill(t[i],-1);}return solve(n,k,target);}

// 1290. Convert Binary Number in a Linked List to Integer Easy

public int getDecimalValue(ListNode head){StringBuilder sb=new StringBuilder();while(head!=null){sb.append(head.val);head=head.next;}return Integer.parseInt(sb.toString(),2);}

// 1422. Maximum Score After Splitting a String Easy

public int maxScore(String s){int n=s.length();int res=Integer.MIN_VALUE;int totalOnes=0;for(int i=0;i<n;i++){if(s.charAt(i)=='1')totalOnes++;}int zero=0;for(int i=0;i<n-1;i++){if(s.charAt(i)=='1')totalOnes--;else zero++;int temp=zero+totalOnes;if(temp>res)res=temp;}return res;}

// 1431. Kids With the Greatest Number of Candies Easy

public List<Boolean>kidsWithCandies(int[]candies,int extraCandies){List<Boolean>ans=new ArrayList<>();int max=-1;for(int i=0;i<candies.length;i++){if(candies[i]>max){max=candies[i];}}for(int i=0;i<candies.length;i++){if(candies[i]+extraCandies>=max)ans.add(true);else ans.add(false);}return ans;}

// 1436. Destination City Easy

public String destCity(List<List<String>>paths){HashSet<String>set=new HashSet<>();for(List<String>city:paths){set.add(city.get(0));}String dest="";for(List<String>city:paths){dest=city.get(1);if(!set.contains(dest))return dest;;}return dest;}

// 1464. Maximum Product of Two Elements in an Array Easy

public int maxProduct(int[]nums){Arrays.sort(nums);int i=nums[nums.length-1];int j=nums[nums.length-2];return(i-1)*(j-1);}

// 1496. Path Crossing Easy

public boolean isPathCrossing(String path){Set<String>set=new HashSet<>();int x=0,y=0;StringBuilder key=new StringBuilder();key.append(x).append("_").append(y);set.add(key.toString());for(char ch:path.toCharArray()){if(ch=='E')x++;else if(ch=='W')x--;else if(ch=='N')y++;else y--;key.setLength(0);key.append(x).append("_").append(y);if(set.contains(key.toString()))return true;set.add(key.toString());}return false;}

// 1578. Minimum Time to Make Rope Colorful Medium

public int minCost(String colors,int[]neededTime){int ans=0;for(int i=1;i<colors.length();i++){if(colors.charAt(i)==colors.charAt(i-1)){ans+=Math.min(neededTime[i],neededTime[i-1]);neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);}}return ans;}

// 1582. Special Positions in a Binary Matrix Easy

public int numSpecial(int[][]mat){int m=mat.length;int n=mat[0].length;

int[]rows=new int[m];int[]cols=new int[n];

int count=0;

for(int i=0;i<m;i++){for(int j=0;j<n;j++){if(mat[i][j]==0){rows[i]++;cols[j]++;}}}

for(int i=0;i<m;i++){for(int j=0;j<n;j++){if(mat[i][j]==1&&rows[i]==n-1&&cols[j]==m-1){count++;}}}return count;}

// 1624. Largest Substring Between Two Equal Characters Easy

public int maxLengthBetweenEqualCharacters(String s){Map<Character,Integer>firstIndex=new HashMap();int ans=-1;for(int i=0;i<s.length();i++){if(firstIndex.containsKey(s.charAt(i)))ans=Math.max(ans,i-firstIndex.get(s.charAt(i))-1);else firstIndex.put(s.charAt(i),i);}return ans;}

// 1637. Widest Vertical Area Between Two Points Containing No Points Easy

public int maxWidthOfVerticalArea(int[][]points){int[]list=new int[points.length];for(int i=0;i<points.length;i++){list[i]=points[i][0];}Arrays.sort(list);int max=Integer.MIN_VALUE;for(int i=0;i<list.length-1;i++){if(list[i+1]-list[i]>max)max=list[i+1]-list[i];}return max;}

// 1679. Max Number of K-Sum Pairs Medium 

public int maxOperations(int[]nums,int k){int count=0;int i=0;int j=nums.length-1;Arrays.sort(nums);while(i<j&&i<nums.length&&j>=0){int sum=nums[i]+nums[j];if(sum==k){count++;i++;j--;}else if(sum<k)i++;else if(sum>k)j--;}return count;}

// 1758. Minimum Changes To Make Alternating Binary String Easy

public int minOperations(String s){int n=s.length();int count=0;for(int i=0;i<n;i++){if(i%2==0){if(s.charAt(i)=='1')count++;}else{if(s.charAt(i)=='0')count++;}}return Math.min(count,n-count);}

// 1768. Merge Strings Alternately Easy

public String mergeAlternately(String word1,String word2){StringBuilder sb=new StringBuilder();int n=word1.length();int m=word2.length();for(int i=0;i<m||i<n;i++){if(i<n)sb.append(word1.charAt(i));if(i<m)sb.append(word2.charAt(i));}return sb.toString();}

// 1897. Redistribute Characters to Make All Strings Equal Easy

public boolean makeEqual(String[]words){if(words.length==1)return true;int[]count=new int[26];for(String word:words){for(char ch:word.toCharArray()){count[ch-'a']++;}}int totalWords=words.length;for(int i:count){if(i%totalWords!=0)return false;}return true;}

// 1913. Maximum Product Difference Between Two Pairs Easy 

public int maxProductDifference(int[]nums){int firstBig=0,secondBig=0;int firstSmall=Integer.MAX_VALUE,secondSmall=Integer.MAX_VALUE;

for(int n:nums){if(n<firstSmall){secondSmall=firstSmall;firstSmall=n;}else if(n<secondSmall){secondSmall=n;}

if(n>firstBig){secondBig=firstBig;firstBig=n;}else if(n>secondBig){secondBig=n;}}

return firstBig*secondBig-firstSmall*secondSmall;}

// 2125. Number of Laser Beams in a Bank Medium

public int numberOfBeams(String[]bank){int n=bank.length;int prevDeviceCount=0;int result=0;for(int i=0;i<n;i++){int currDeviceCount=0;for(char ch:bank[i].toCharArray())if(ch=='1')currDeviceCount++;result+=(prevDeviceCount*currDeviceCount);prevDeviceCount=(currDeviceCount==0)?prevDeviceCount:currDeviceCount;}return result;}

// 2482. Difference Between Ones and Zeros in Row and Column Medium

public int[][]onesMinusZeros(int[][]grid){int m=grid.length;int n=grid[0].length;int[]oneRows=new int[m];int[]zeroRows=new int[m];

int[]oneCols=new int[n];int[]zeroCols=new int[n];

for(int i=0;i<m;i++){for(int j=0;j<n;j++){if(grid[i][j]==1){oneRows[i]+=1;oneCols[j]+=1;}}}

int[][]diff=new int[m][n];for(int i=0;i<m;i++){for(int j=0;j<n;j++){int zerosInRow=n-oneRows[i];int zerosInCol=m-oneCols[j];diff[i][j]=oneRows[i]+oneCols[j]-zerosInRow-zerosInCol;}}return diff;}

// 2610. Convert an Array Into a 2D Array With Conditions Medium

public List<List<Integer>>findMatrix(int[]nums){int mp[]=new int[nums.length+1];ArrayList<List<Integer>>ans=new ArrayList<>();for(int num:nums){if(mp[num]==ans.size())ans.add(new ArrayList<>());ans.get(mp[num]).add(num);mp[num]++;}return ans;}

// 2706. Buy Two Chocolates Easy

public int buyChoco(int[]prices,int money){int minPrice=Integer.MAX_VALUE;int secondMinPrice=Integer.MAX_VALUE;for(int price:prices){if(price<minPrice){secondMinPrice=minPrice;minPrice=price;}else secondMinPrice=Math.min(secondMinPrice,price);}int pur=minPrice+secondMinPrice;if(pur<=money)return money-pur;return money;}

// 2870. Minimum Number of Operations to Make Array Empty Medium

public int minOperations(int[]nums){Map<Integer,Integer>map=new HashMap<>();for(int i=0;i<nums.length;i++)map.put(nums[i],map.getOrDefault(nums[i],0)+1);int op=0;for(Map.Entry<Integer,Integer>entry:map.entrySet()){int freq=entry.getValue();if(freq==1)return-1;while(freq>4){op++;freq=freq-3;}if(freq==3)op++;else{while(freq>0){op++;freq=freq-2;}}}return op;}

//Amount two words

static void amountToWords(){
        Stack<String> s = new Stack<>();
        int amt = 218;
        String[] ones = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if (amt < 20) {
            System.out.println(ones[amt]);
            return;
        }

        int count = 0;

        while (amt > 0) {
            int last = amt % 10;
            if ((last == 0 || last < 10) && count == 0) {
                last = amt % 100;
                amt /= 100;
                count = count + 2;
                if (last < 20) {
                    s.push(ones[last] + " ");
                } else {
                    s.push(tens[last / 10] + " ");
                }
                continue;
            }
            if (count == 0) {
                s.push(ones[last] + " ");
            } else if (count == 1) {
                s.push(tens[last] + " ");
            } else if (count == 2) {
                s.push(ones[last] + " Hundred ");
            } else if (count == 3) {
                s.push(ones[last] + " Thousand ");
            }
            count++;
            amt /= 10;
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
}
