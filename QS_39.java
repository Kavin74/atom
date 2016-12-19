#include<iostream.h>
using namespace std;
struct TreeNode
{
int val;
TreeNode*left,*right;
TreeNode(int v):val(v),left(null),right(null)
{
}
};
bool mirror_equals(TreeNode *left,TreeNode *right)
{
if(left==null\right==null)
return left==null&&right==null;
return(left->val==right->val&&mirror_equals(left,right->right)&&mirror_equals(left->right,right->left);
}
bool is symmetric(TreeNode*root)
{
if(root==NULL)
return true;
if(mirror_equals(root->left,root->right))
return true;
return false;
}
void Test1()
{
TreeNode *root=new TreeNode(1);
root->left=new TreeNode(2);
if(is_symmetric(root))
{
cout<<"symmetric"<<end1;
}
int main()
{
Test1();
return0;
}