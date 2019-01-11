package com.testptoject.budgetsocialmedia.repos;


import com.testptoject.budgetsocialmedia.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

    void deleteByText(String text);

}