package ru.itis.quest.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ru.itis.quest.models.Quest;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class QuestRepositoryJdbcTemplateImpl implements QuestRepository {

    private JdbcTemplate jdbcTemplate;


    public QuestRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    //language=SQL
    private static final String SQL_SELECT_QUEST_BY_ID =
            "select * from quest where id = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_QUESTS =
            "select * from quest";

    //language=SQL
    private static final String SQL_INSERT =
            "insert into quest(quest_name, quest_type, number_of_participants, free_participants, age_limit, district_id, cost) values (?, ?, ?, ?, ?, ?, ?)";


    private RowMapper<Quest> questRowMapper = new RowMapper<Quest>() {
        @Override
        public Quest mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            return Quest.builder()
                    .id(resultSet.getLong("id"))
                    .name(resultSet.getString("name"))
                    .type(resultSet.getString("type"))
                    .numberOfParticipants(resultSet.getInt("numbe_of_participants"))
                    .freeParticipants(resultSet.getInt("free_participants"))
                    .ageLimit(resultSet.getInt("age_limit"))
                    .timeOfQuest(resultSet.getTimestamp("time_of_quest"))
                    .cost(resultSet.getLong("cost"))
                    .build();
        }
    };

    @Override
    public List<Quest> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL_QUESTS, questRowMapper);
    }


    @Override
    public Optional<Quest> find(Long id) {
        return Optional.of(jdbcTemplate.queryForObject(SQL_SELECT_QUEST_BY_ID, questRowMapper, id));
    }

    @Override
    public void save(Quest model) {
        jdbcTemplate.update(SQL_INSERT, model.getName(), model.getType(), model.getNumberOfParticipants(), model.getCost(), model.getAgeLimit());

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Quest model) {

    }


}
