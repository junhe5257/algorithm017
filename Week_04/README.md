之前的一周一直在加班赶项目，所以作业拖到现在，非常抱歉。

DFS与BFS的比较上来说，应该关注于实际业务模型来选用，假设我们要查找的目标总是在子结点或是接近于
子结点，那么DFS更好，如果我们要查找的目标更接近于根结点，那么BFS更优，也有特殊情况，例如要查找
的目标在整个树的最中间(指分支与层级都在最中间)，或者刚好是右下角的最后一个叶子结点，那么此时DFS
与BFS几乎没有区别。

贪心算法相比于动态规划来说最大的缺陷就是不可回滚，而仅仅局部最优是极难达成全局最优的，然而贪心算法
写起来的难度原低于动态规划，所以我们真正应该关注的是如何证明该问题使用贪心算法可以得到最优解。

二分查找可以算是最简单的查找方式了，时间复杂度为O(logN)，可以使用二分的三要素是，1有序2有上下界
3可以通过index访问元素，其实感觉二分查找放在这一周有点分类上的突兀，可以考虑略微调整。