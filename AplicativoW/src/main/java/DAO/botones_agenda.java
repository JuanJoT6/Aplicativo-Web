package DAO;
import GETSETTER.agenda;

import java.util.List;

public interface botones_agenda {
    public int Insert_Agendar(agenda agendar);
    public List<agenda> Mostrar_Agendar(agenda agendar);
    public int Update_Agendar(agenda agendar);

}
