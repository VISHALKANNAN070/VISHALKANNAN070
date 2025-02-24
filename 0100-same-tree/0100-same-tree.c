/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool check(struct TreeNode* a,struct TreeNode* b){
    if(a==NULL && b==NULL) return true;
    if(a==NULL||b==NULL) return false;
    else
    return (a->val==b->val) && check(a->left,b->left) && check(a->right,b->right);
}
bool isSameTree(struct TreeNode* p, struct TreeNode* q) {
    return check(p,q);
}