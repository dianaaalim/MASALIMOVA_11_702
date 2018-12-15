package ru.itis.quest.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.itis.quest.models.Quest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestRowMapper implements RowMapper<Quest> {
    @Override
    public Quest mapRow(ResultSet resultSet, int i) throws SQLException {
        return Quest.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .cost(resultSet.getLong("cost"))
                .type(resultSet.getString("type"))
                .numberOfParticipants(resultSet.getInt("numbe_of_participants"))
                .freeParticipants(resultSet.getInt("free_participants"))
                .ageLimit(resultSet.getInt("age_limit"))
                .timeOfQuest(resultSet.getTimestamp("time_of_quest"))
                .build();
    }

    public List<Quest> mapRow(ResultSet resultSet) throws SQLException {
        List<Quest> quests = new ArrayList<>();
        while (resultSet.next()) {
            quests.add(mapRow(resultSet, 1));
        }
        return quests;
    }
}
