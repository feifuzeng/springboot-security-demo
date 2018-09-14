package com.feifz.service;


import com.feifz.entity.Blog;

import java.util.List;


public interface IBlogService {
    List<Blog> getBlogs();
    void deleteBlog(long id);
}
