package com.matthew.jobportal.service.impl;

import com.matthew.jobportal.entity.Job;
import com.matthew.jobportal.repository.JobRepository;
import com.matthew.jobportal.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job getJobById(Long id) {
        return jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
    }

    @Override
    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Job updateJob(Long id, Job updatedJob) {
        Job existingJob = getJobById(id);

        existingJob.setTitle(updatedJob.getTitle());
        existingJob.setDescription(updatedJob.getDescription());
        existingJob.setCompanyName(updatedJob.getCompanyName());
        existingJob.setLocation(updatedJob.getLocation());
        existingJob.setSalary(updatedJob.getSalary());
        existingJob.setSkillsRequired(updatedJob.getSkillsRequired());

        return jobRepository.save(existingJob);
    }

    @Override
    public void deleteJob(Long id) {
        Job existingJob = getJobById(id);
        jobRepository.delete(existingJob);
    }
}