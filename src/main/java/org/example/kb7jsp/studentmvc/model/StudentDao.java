package org.example.kb7jsp.studentmvc.model;

import java.util.List;

public class StudentDao {
    public List<String> findAll() {
//        return null;
        return List.of(
                "강태규", "권유현", "김건우", "김기선", "김민철",
                "김수현", "김현태", "송준수", "송태권", "양승환",
                "오진호", "이대주", "이민호", "이아영", "이지민",
                "이지은", "이채연", "장지연", "최규진", "최보윤",
                "홍상우", "황지원"
        );
    }
}