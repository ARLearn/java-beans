import org.celstec.arlearn2.beans.deserializer.json.JsonBeanDeserializer;
import org.celstec.arlearn2.beans.game.Config;
import org.celstec.arlearn2.beans.generalItem.EndMessage;
import org.celstec.arlearn2.beans.generalItem.Notification;
import org.celstec.arlearn2.beans.generalItem.SortQuestion;
import org.celstec.arlearn2.beans.generalItem.SortQuestionItem;

/**
 * ****************************************************************************
 * Copyright (C) 2013 Open Universiteit Nederland
 * <p/>
 * This library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 * <p/>
 * Contributors: Stefaan Ternier
 * ****************************************************************************
 */
public class Test {
    public static void main(String[] args) throws  Exception{
        SortQuestionItem item = new SortQuestionItem();
        item.setCorrectPosition(1);
        item.setText("Program the solution");
        item.setId("id1");


        SortQuestion sortQuestion = new SortQuestion();
        sortQuestion.setText("text");
        sortQuestion.setRichText("Here comes some text");
        sortQuestion.addAnswer(item);

        item = new SortQuestionItem();
        item.setCorrectPosition(1);
        item.setText("Analyse the problem");
        item.setId("id2");
        sortQuestion.addAnswer(item);

        item = new SortQuestionItem();
        item.setCorrectPosition(1);
        item.setText("Do a UI study");
        item.setId("id3");
        sortQuestion.addAnswer(item);
        Notification not = new Notification();
        not.setNotificationType(1);
        not.setMessage("mes");
        not.setReadMessage("bekijk");
        sortQuestion.setNotification(not);
        System.out.println(sortQuestion);

        System.out.println(JsonBeanDeserializer.deserialize(sortQuestion.toString()));

        EndMessage endMessage = new EndMessage();
        endMessage.setTitle("Gefel");
        System.out.println(endMessage);
        System.out.println(JsonBeanDeserializer.deserialize(endMessage.toString()));

//        JsonBeanDeserializer.deserialize(EndMessage.class, endMessage.toString())

//        Config c = new Config();
//        c.setBoundingBoxSouth(5.56d);
//        System.out.println(c.toString());
    }
}
