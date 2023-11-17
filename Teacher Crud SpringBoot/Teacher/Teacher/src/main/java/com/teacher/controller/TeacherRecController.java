package com.teacher.controller;

import com.teacher.entities.TeacherRecord;
import com.teacher.service.TeacherRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/teacher")
public class TeacherRecController {

    @Autowired
    private TeacherRecordService teacherRecordService;

    @PostMapping(path = "/newTeacher")
    public TeacherRecord createTeacher(@RequestBody TeacherRecord teacherRecord) {
        return this.teacherRecordService.saveTeacher(teacherRecord);
    }

    @GetMapping(path = "/getById/{id}")
    public TeacherRecord getByTeacherId(@PathVariable Integer id) {
        return this.teacherRecordService.getTeacherById(id);
    }

    @GetMapping(path = "/getAllRecord")
    public List<TeacherRecord> allRecords() {
        return this.teacherRecordService.getAllTeacher();
    }

    @PutMapping(path = "/updateById/{id}")
    public TeacherRecord updateByTeacherId(@PathVariable Integer id, @RequestBody TeacherRecord teacherRecord) {
        return this.teacherRecordService.updateTeacherById(id, teacherRecord);
    }

    @DeleteMapping(path = "/deleteById/{id}")
    public void deleteByTeacherId(@PathVariable Integer id) {
        this.teacherRecordService.deleteTeacherById(id);
    }

    @DeleteMapping(path = "/deleteAllRecord")
    public void clearRecord() {
        this.teacherRecordService.deleteAllTeacher();
    }
}
