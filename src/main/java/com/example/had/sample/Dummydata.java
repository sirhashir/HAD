package com.example.had.sample;

import com.example.had.entity.*;
import com.example.had.repository.*;

import com.github.javafaker.Faker;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class Dummydata {

    private final PasswordEncoder passwordEncoder;
    public static answerRepository answerRepository;
    public static authRepository authRepository;
    public static doctorConnectionRequestRepository doctorConnectionRequestRepository;
    public static doctorRepository doctorRepository;
    public static questionRepository questionRepository;

    public static userRepository userRepository;

    public Dummydata(PasswordEncoder passwordEncoder,
                     answerRepository answerRepository,
                     authRepository authRepository,
                     doctorConnectionRequestRepository doctorConnectionRequestRepository,
                     doctorRepository doctorRepository,
                     questionRepository questionRepository,
                     userRepository userRepository)
    {
        this.passwordEncoder = passwordEncoder;
        this.answerRepository = answerRepository;
        this.authRepository = authRepository;
        this.doctorConnectionRequestRepository = doctorConnectionRequestRepository;
        this.doctorRepository = doctorRepository;
        this.questionRepository = questionRepository;
        this.userRepository = userRepository;
    }

    public void generateData()
    {
        Faker faker = new Faker();
        for (int i = 0; i < 20; i++)
        {
            User user = new User(
                    faker.internet().emailAddress(),
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().firstName(),
                    faker.demographic().sex(),
                    faker.date().birthday(),
                    faker.phoneNumber().cellPhone().substring(0, 12),
                    faker.address().fullAddress(),
                    faker.date().toString(),
                    faker.number().numberBetween(1, 100)
            );

            Doctor doctor = new Doctor(
                    faker.internet().emailAddress(),
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().firstName(),
                    faker.demographic().sex(),
                    faker.number().numberBetween(18, 80),
                    "MBBS",
                    faker.job().keySkills(),
                    faker.number().numberBetween(1, 14),
                    faker.address().fullAddress(),
                    faker.phoneNumber().cellPhone().substring(0, 12),
                    faker.internet().url(),
                    faker.number().numberBetween(1, 5),
                    faker.number().numberBetween(15, 20),
                    faker.number().numberBetween(1, 15),
                    faker.regexify("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}"),
                    faker.date().toString()
            );


            Answers answers = new Answers(
                    faker.random().toString(),
                    faker.random().toString(),
                    faker.random().toString(),
                    faker.random().toString(),
                    faker.number().numberBetween(0,10),
                    faker.number().numberBetween(0,10),
                    faker.number().numberBetween(0,10),
                    faker.number().numberBetween(0,10),
                    faker.number().numberBetween(1,6),
                    faker.number().numberBetween(1,5),
                    user
            );


            List<String> articleList = new ArrayList<>();
            articleList.add("Audio");
            articleList.add("Video");
            articleList.add("Text");
            articleList.add("Youtube");

            int week = faker.random().nextInt(1, 8);
            int session = faker.random().nextInt(1, 7);

            Articles articles = new Articles(
                    faker.options().option(articleList).toString(),
                    faker.numerify(String.valueOf(week)),
                    faker.numerify(String.valueOf(session)),
                    faker.internet().url(),
                    faker.lorem().sentence(10)
            );


            PersonalArticle personalArticle = new PersonalArticle(
                    faker.options().option(articleList).toString(),
                    faker.name().firstName(),
                    faker.internet().image(),
                    doctor,
                    user,
                    faker.internet().url(),
                    faker.lorem().sentence(10)
            );


            Question question = new Question(
                    faker.lorem().sentence() + "?",
                    "MCQ",
                    faker.random().toString(),
                    faker.random().toString(),
                    faker.random().toString(),
                    faker.random().toString(),
                    faker.number().numberBetween(0,10),
                    faker.number().numberBetween(0,10),
                    faker.number().numberBetween(0,10),
                    faker.number().numberBetween(0,10),
                    faker.number().numberBetween(1,6),
                    faker.number().numberBetween(1,5)
            );


            Report report = new Report(
                    faker.number().numberBetween(1,6),
                    faker.number().numberBetween(1,5),
                    faker.number().numberBetween(1,101),
                    faker.date().toString(),
                    faker.date().toString(),
                    faker.number().numberBetween(1,5),
                    faker.number().numberBetween(1,6)
            );


            Date startDate = Date.from(Instant.parse("2022-01-01T00:00:00Z"));
            Date endDate = Date.from(Instant.parse("2022-12-31T23:59:59Z"));

            Auth auth = new Auth(
                    user.getFirstName(),
                    passwordEncoder.encode("password"),
                    "USER",
                    faker.date().between(startDate, endDate).toString()
            );


            userRepository.save(user);
            doctorRepository.save(doctor);


            List<Answers> answersList = new ArrayList<>();
            answersList.add(answers);
            user.setAnswers(answersList);

            user.setPersonalArticle(personalArticle);
            user.setReport(report);
            user.setDoctor(doctor);



            List<User> userList = new ArrayList<>();
            userList.add(user);
            doctor.setUserList(userList);

            userRepository.save(user);
            doctorRepository.save(doctor);


        }
    }
}