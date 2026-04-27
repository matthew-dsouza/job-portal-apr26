package com.matthew.jobportal.service;

import com.matthew.jobportal.entity.Job;

import java.util.List;

public interface JobService {
    List<Job> getAllJobs();
    Job getJobById(Long id);
    Job createJob(Job job);
    Job updateJob(Long id, Job job);
    void deleteJob(Long id);
}