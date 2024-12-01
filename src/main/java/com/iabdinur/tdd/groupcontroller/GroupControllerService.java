package com.iabdinur.tdd.groupcontroller;

import java.util.Map;

public interface GroupControllerService {
    public Map<String, Trainee> getAllTrainees();
    public void removeTraineeByUsername(String username);
    public void addTrainee(Trainee trainee);
}

