package br.com.othonbatista.jogodeperguntas;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public abstract class MyDAORoom {
    @Insert
    public abstract long inserirQuestao(Questoes questoes);

    @Query("SELECT * FROM Questoes")
    public abstract List<Questoes> pesquisarTodasQuestoes();
}
