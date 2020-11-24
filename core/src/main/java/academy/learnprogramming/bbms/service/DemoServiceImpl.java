package academy.learnprogramming.bbms.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String getMessage() {
        return "hello core";
    }
}
