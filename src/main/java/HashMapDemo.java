import java.util.HashMap;


/* 1. 根据key生成hashcode
   2. 判断当前HashMap对象中的数组是否为空，如果为空则初始化该数组
   3. 根据逻辑与运算，算出hashcode基于当前数组对应的数组下标i
   4. 判断数组的第i个位置的元素（tab[i]）是否为空
       a. 如果为空，则将key，value封装为Node对象赋值给tab[i]
       b. 如果不为空：
            ⅰ. 如果put方法传入进来的key等于tab[i].key，那么证明存在相同的key
            ⅱ. 如果不等于tab[i].key，则：
                1. 如果tab[i]的类型是TreeNode，则表示数组的第i位置上是一颗红黑树，
                那么将key和value插入到红黑树中，
                并且在插入之前会判断在红黑树中是否存在相同的key
                2. 如果tab[i]的类型不是TreeNode，则表示数组的第i位置上是一个链表
                ，那么遍历链表寻找是否存在相同的key，
                并且在遍历的过程中会对链表中的结点数进行计数，当遍历到最后一个结点时，
                会将key,value封装为Node插入到链表的尾部，
                同时判断在插入新结点之前的链表结点个数是不是大于等于8，
                如果是，则将链表改为红黑树。
            ⅲ. 如果上述步骤中发现存在相同的key，则根据onlyIfAbsent标记来判断是否需要更新value值，然后返回oldValue
   5. modCount++
   6. HashMap的元素个数size加1
   7. 如果size大于扩容的阈值，则进行扩容*/
public class HashMapDemo {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("dads","1552152");
        map.put("dasda","adsada");
        map.put("dasda","adsada2222");
        map.put(null,"");


    }

}
