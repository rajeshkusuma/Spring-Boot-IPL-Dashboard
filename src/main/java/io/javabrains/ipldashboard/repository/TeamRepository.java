package io.javabrains.ipldashboard.repository;

import io.javabrains.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;


// 05 Building the first API Team Info IPL Dashboard
public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByTeamName(String teamName);
}
