package com.itheima.homework.T6;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 我国有34个省级行政区，分别是： 23个省：河北省、山西省、吉林省、辽宁省、黑龙江省、陕西省、甘肃省、青海省、山东省、
 * 福建省、浙江省、台湾省、河南省、湖北省、湖南省、江西省、江苏省、安徽省、广东省、海南省、四川省、贵州省、云南省。
 * 4个直辖市：北京市、天津市、上海市、重庆市。 5个自治区：内蒙古自治区、新疆维吾尔自治区、宁夏回族自治区、广西壮族自治区、西藏自治区。
 * 2个特别行政区：香港特别行政区、澳门特别行政区。 请使用流依次完成下列操作：
 * 1、统计三个字的省份的个数
 * 2、统计名字中包含方位名词的省份（东西南北）的个数
 * 3、打印名字中包含方位名词的普通省份（非自治区直辖市特别行政区）的名字
 * 4、将所有的特殊省份（自治区直辖市特别行政区）提取出来并放到新数组中
 */
public class Main {
    public static void main(String[] args) {
        String address = "河北省、山西省、吉林省、辽宁省、黑龙江省、陕西省、甘肃省、青海省、山东省、福建省、浙江省、台湾省、河南省、湖北省、湖南省、江西省、" +
                "江苏省、安徽省、广东省、海南省、四川省、贵州省、云南省、北京市、天津市、上海市、重庆市、" +
                "内蒙古自治区、新疆维吾尔自治区、宁夏回族自治区、广西壮族自治区、西藏自治区、香港特别行政区、澳门特别行政区";

        String[] split = address.split("、");
        String[] a;

        System.out.println(Arrays.stream(split).filter(add -> add.length() == 3).count());

        System.out.println(Arrays.stream(split).filter(add -> add.contains("东") ||
                add.contains("南") ||
                add.contains("西") ||
                add.contains("北")).count());

        Arrays.stream(split).filter(add -> (add.contains("东") ||
                add.contains("南") ||
                add.contains("西") ||
                add.contains("北")) && !
                (add.contains("自治区"))).forEach(System.out::println);

        System.out.println();

        String[] collect = Arrays.stream(split).filter(add -> (add.contains("自治区") ||
                add.contains("市") ||
                add.contains("特别行政区"))).toArray(String[]::new);

        System.out.println(Arrays.toString(collect));

//        String[] strings = collect.toArray(new String[collect.size()]);
//        System.out.println(Arrays.toString(strings));
    }
}
