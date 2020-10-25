package com.itheima.homework.T3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 请使用TreeMap集合保存劳模信息,要求以劳模对象为键,家庭住址为值,并按照劳模的年龄从大到小排序后输出;
 * <p>
 * 信息如下:
 * <p>
 * 18岁的张三,北京
 * <p>
 * 20岁的李四,上海
 * <p>
 * 35岁的王五,天津
 * <p>
 * 21岁的赵六,北京
 * <p>
 * 19岁的田七,上海
 * <p>
 * **要求:**
 * <p>
 * 1:劳模类中有姓名和年龄两个属性;
 * <p>
 * 2:添加上述信息后,使用代码删除张三的信息
 * <p>
 * 3:添加上述信息后,使用代码修改李四的家庭住址为郑州
 * <p>
 * 4:使用至少两种方式遍历集合中的信息并输出;
 */
public class Main {
    public static void main(String[] args) {
        TreeMap<ModelOfLabor, String> treeMap = new TreeMap<>((mol1, mol2) -> mol2.getAge() - mol1.getAge());
        {
            treeMap.put(new ModelOfLabor("李四", 20), "上海");
            treeMap.put(new ModelOfLabor("王五", 35), "天津");
            treeMap.put(new ModelOfLabor("赵六", 21), "北京");
            treeMap.put(new ModelOfLabor("田七", 19), "上海");
            treeMap.put(new ModelOfLabor("张三", 18), "北京");
        }

        Set<ModelOfLabor> keySet = treeMap.keySet();
        for (ModelOfLabor mol : keySet) {
            if ("王五".equals(mol.getName())) {
                System.out.println(treeMap.remove(mol));
            }

            if ("李四".equals(mol.getName())) {
                treeMap.put(mol, "郑州");
            }
        }

        System.out.println("------第一种方式------");
        Set<Map.Entry<ModelOfLabor, String>> entries = treeMap.entrySet();
        for (Map.Entry<ModelOfLabor, String> entry : entries) {
            System.out.println(entry.getKey().getAge() + "的" + entry.getKey().getName() + "," + entry.getValue());
        }
        System.out.println();
        System.out.println();

        System.out.println("------第二种方式------");
        treeMap.forEach(((key, value) -> {
            System.out.println(key.getAge() + "的" + key.getName() + "," + value);
        }));
    }
}
