package com.example.had.sample;

import com.example.had.entity.Question;
import com.example.had.repository.questionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Actualdata
{
    public static questionRepository questionRepository;

    public Actualdata(questionRepository questionRepository)
    {
        Actualdata.questionRepository = questionRepository;
    }

    public void generateData()
    {

        Question question1 = new Question(
                "Are you suffering from feelings of sadness, hopelessness or emptiness?",
                "MCQ",
                "Never",
                "Occasionally",
                "Often(once a week or more)",
                "Everyday",
                25,
                50,
                75,
                100,
                0,
                0
        );
        Question question2 = new Question(
                "Do you find it hard to find pleasure in activities you used to enjoy?",
                "MCQ",
                "Never",
                "Occasionally",
                "Very often",
                "Always",
                25,
                50,
                75,
                100,
                0,
                0
        );
        Question question3 = new Question(
                "Has your appetite changed?",
                "MCQ",
                "No",
                "Somewhat",
                "Quite a lot",
                "I don't like the food I used to.",
                25,
                50,
                75,
                100,
                0,
                0
        );
        Question question4 = new Question(
                "Do you find yourself lacking energy and motivation?",
                "MCQ",
                "No",
                "Somewhat",
                "More than I used to",
                "Completely",
                25,
                50,
                75,
                100,
                0,
                0
        );

        Question question5 = new Question(
                "Has your sex drive reduced?",
                "MCQ",
                "No",
                "Somewhat",
                "Drastically",
                "Completely",
                25,
                50,
                75,
                100,
                0,
                0
        );

        Question question6 = new Question(
                "Are you having trouble getting to sleep and staying asleep? Or are you finding it hard to get up in the morning?",
                "MCQ",
                "Never",
                "Sometimes",
                "Frequently",
                "Nearly everyday",
                25,
                50,
                75,
                100,
                0,
                0
        );

        Question question7 = new Question(
                "Have you had thoughts about harming yourself or ending your life?",
                "MCQ",
                "Never",
                "Sometimes",
                "Frequently",
                "Nearly everyday",
                25,
                50,
                75,
                100,
                0,
                0
        );

        Question question8 = new Question(
                "Are you feeling bad about yourself - or that you are a failure or have let yourself or your family down?",
                "MCQ",
                "Never",
                "Sometimes",
                "Frequently",
                "Nearly everyday",
                25,
                50,
                75,
                100,
                0,
                0
        );

        Question question9 = new Question(
                "Do you have trouble concentrating on things, such as reading the newspaper or watching television?",
                "MCQ",
                "Never",
                "Sometimes",
                "Frequently",
                "Nearly everyday",
                25,
                50,
                75,
                100,
                0,
                0
        );

        Question question10 = new Question(
                "Have you found yourself moving or speaking so slowly that other people could have noticed?",
                "MCQ",
                "Never",
                "Sometimes",
                "Frequently",
                "Nearly everyday",
                25,
                50,
                75,
                100,
                0,
                0
        );



        //session questions

        List<Question> session = new ArrayList<>();

        //week 1 session 1
        session.add(new Question(
                "How often have you felt down, depressed, or hopeless in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                1
        ));
        session.add(new Question(
                "Have you experienced a decrease in pleasure or interest in activities that you typically enjoy in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                1
        ));
        session.add(new Question(
                "Have you had trouble falling asleep or staying asleep in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                1
        ));
        session.add(new Question(
                "Have you had any changes in your appetite or weight in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                1
        ));
        session.add(new Question(
                "Have you had any feelings of worthlessness or excessive guilt in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                1
        ));





        //week 1 session 2

        session.add(new Question(
                "How often have you felt fatigued or had low energy in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                2
        ));
        session.add(new Question(
                "Have you had difficulty concentrating or making decisions in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                2
        ));
        session.add(new Question(
                "Have you had any thoughts of self-harm or suicide in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                2
        ));
        session.add(new Question(
                "Have you had any physical symptoms, such as headaches or stomach aches, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                2
        ));
        session.add(new Question(
                "Have you had any changes in your sex drive or sexual function in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                2
        ));






        //week 1 session 3

        session.add(new Question(
                "Have you felt irritable or easily agitated in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                3
        ));
        session.add(new Question(
                "Have you felt socially isolated or withdrawn in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                3
        ));
        session.add(new Question(
                "Have you had any thoughts of self-criticism or self-doubt in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                3
        ));
        session.add(new Question(
                "Have you had any trouble getting motivated or initiating tasks in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                3
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms of anxiety, such as racing heart or sweating, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                1,
                3
        ));





        //week 2 session 1----------------------------------------------------------


        session.add(new Question(
                "Have you had any intrusive thoughts or memories in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                1
        ));
        session.add(new Question(
                "Have you had any avoidance behaviors, such as avoiding places or people, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                1
        ));
        session.add(new Question(
                "Have you had any nightmares or flashbacks in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                1
        ));
        session.add(new Question(
                "Have you had any physiological reactions, such as sweating or trembling, in response to triggers in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                1
        ));
        session.add(new Question(
                "Have you experienced any dissociative symptoms, such as feeling detached from your surroundings, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                1
        ));



        //week 2 session 2
        session.add(new Question(
                "Have you experienced any panic attacks in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                2
        ));
        session.add(new Question(
                "Have you had any persistent worries or concerns in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                2
        ));
        session.add(new Question(
                "Have you had any compulsive behaviors, such as checking or counting, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                2
        ));
        session.add(new Question(
                "Have you had any obsessions or intrusive thoughts that you couldn't get rid of in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                2
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as muscle tension or restlessness, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                2
        ));





        //week 2 session 3
        session.add(new Question(
                "Have you had any phobias or intense fears in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                3
        ));
        session.add(new Question(
                "Have you had any trouble functioning in your daily life due to anxiety in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                3
        ));
        session.add(new Question(
                "Have you had any panic attacks or sudden surges of fear in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                3
        ));
        session.add(new Question(
                "Have you had any intrusive thoughts or memories that caused anxiety in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                3
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms of anxiety, such as shortness of breath or chest pain, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                2,
                3
        ));











        //week 3 session 1 -------------------------------------------------------------------


        session.add(new Question(
                "Have you had any feelings of sadness or hopelessness in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                1
        ));
        session.add(new Question(
                "Have you experienced any guilt or shame in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                1
        ));
        session.add(new Question(
                "Have you had any trouble sleeping, such as difficulty falling asleep or waking up frequently, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                1
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as headaches or stomach aches, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                1
        ));
        session.add(new Question(
                "Have you had any negative thoughts about yourself or your future in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                1
        ));




        //week 3 session 2


        session.add(new Question(
                "Have you had any thoughts of self-harm or suicide in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                2
        ));
        session.add(new Question(
                "Have you had any trouble concentrating or making decisions in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                2
        ));
        session.add(new Question(
                "Have you had any loss of interest in activities you previously enjoyed in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                2
        ));
        session.add(new Question(
                "Have you had any changes in appetite, such as overeating or undereating, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                2
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as fatigue or low energy, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                2
        ));




        //week 3 session 3
        session.add(new Question(
                "Have you had any feelings of worthlessness or self-doubt in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                3
        ));
        session.add(new Question(
                "Have you had any trouble with your memory or concentration in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                3
        ));
        session.add(new Question(
                "Have you had any trouble with your memory or concentration in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                3
        ));
        session.add(new Question(
                "Have you had any thoughts of self-harm or suicide in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                3
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as aches and pains, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                3,
                3
        ));








        //week 4 session 1:
        session.add(new Question(
                "Have you experienced any episodes of sadness or tearfulness in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                1
        ));
        session.add(new Question(
                "Have you had any trouble with your appetite, such as eating too much or too little, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                1
        ));
        session.add(new Question(
                "Have you had any trouble sleeping, such as difficulty falling asleep or staying asleep, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                1
        ));
        session.add(new Question(
                "Have you had any thoughts of self-harm or suicide in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                1
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as fatigue or loss of energy, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                1
        ));




        //week 4 session 2:
        session.add(new Question(
                "Have you had any difficulty with concentration or decision-making in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                2
        ));
        session.add(new Question(
                "Have you had any trouble with memory or recall in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                2
        ));
        session.add(new Question(
                "Do you feel like the previous sessions have helped you in counter-intuitively increasing your stress",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                2
        ));
        session.add(new Question(
                "Have you had any thoughts of self-harm or suicide in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                2
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as stomach issues or headaches, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                2
        ));



        //week 4 session 3
        session.add(new Question(
                "Have you had any difficulty finding enjoyment or pleasure in activities you used to enjoy in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                3
        ));
        session.add(new Question(
                "Have you had any trouble with your appetite, such as eating too much or too little, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                3
        ));
        session.add(new Question(
                "Have you had any trouble with motivation or finding the energy to do things in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                3
        ));
        session.add(new Question(
                "Have you had any thoughts of self-harm or suicide in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                3
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as chest pain or shortness of breath, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                4,
                3
        ));









        //week 5 session 1
        session.add(new Question(
                "Have you felt less interested in sex or had a decrease in sexual desire in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                1
        ));
        session.add(new Question(
                "Have you felt more irritable or short-tempered than usual in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                1
        ));
        session.add(new Question(
                "Have you had any thoughts of self-harm or suicide in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                1
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as dizziness or nausea, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                1
        ));
        session.add(new Question(
                "Have you felt like shutting yourself away from everyone else in your own room?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                1
        ));



        //week 5 session 2
        session.add(new Question(
                "Have you had any trouble with your appetite, such as eating too much or too little, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));
        session.add(new Question(
                "Have you felt more anxious or worried than usual in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));
        session.add(new Question(
                "Have you had any trouble sleeping, such as difficulty falling asleep or staying asleep, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as trembling or sweating, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));
        session.add(new Question(
                "Do you still get the feeling that everyone else is plotting against you?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));




        //week 5 session 3
        session.add(new Question(
                "Have you felt more pessimistic or hopeless than usual in the",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));
        session.add(new Question(
                "Have you felt a lack of energy or fatigue that interferes with daily activities in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));
        session.add(new Question(
                "Have you had any trouble with your appetite, such as eating too much or too little, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));
        session.add(new Question(
                "Have you had any thoughts of self-harm or suicide in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));
        session.add(new Question(
                "Have you experienced any physical symptoms, such as headaches or body aches, in the past week?",
                "MCQ",
                "Not at all",
                "Occasionally",
                "More than half the days",
                "Nearly every day",
                25,
                50,
                75,
                100,
                5,
                2
        ));




        questionRepository.saveAll(session);






        questionRepository.save(question1);
        questionRepository.save(question2);
        questionRepository.save(question3);
        questionRepository.save(question4);
        questionRepository.save(question5);
        questionRepository.save(question6);
        questionRepository.save(question7);
        questionRepository.save(question8);
        questionRepository.save(question9);
        questionRepository.save(question10);




    }

}
