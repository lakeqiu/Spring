package com.lakeqiu.soring.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 集合类型的注入
 */
public class CollectionBean {
    private String[] strings;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "strings=" + Arrays.toString(strings) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
