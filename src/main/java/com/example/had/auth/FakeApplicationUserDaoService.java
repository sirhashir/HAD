package com.example.had.auth;

import com.example.had.entity.Auth;
import com.example.had.repository.loginRepository;
import com.example.had.security.ApplicationUserRole;
import com.google.common.collect.Lists;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.example.had.security.ApplicationUserRole.*;

@Repository("fake")
public class FakeApplicationUserDaoService implements ApplicationUserDao {

    private final PasswordEncoder passwordEncoder;
    private final loginRepository loginRepository;

    @Autowired
    public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder,
                                         loginRepository loginRepository) {
        this.passwordEncoder = passwordEncoder;
        this.loginRepository = loginRepository;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUsers(username)
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }
    private List<ApplicationUser> getApplicationUsers(String username) {
        Auth applicationUser = loginRepository.findFirstByUsername(username);
        String inputRole = applicationUser.getRole();
        ApplicationUserRole userRole = ApplicationUserRole.valueOf(inputRole.toUpperCase());
        Set<SimpleGrantedAuthority> authorities = userRole.getGrantedAuthorities();

        List<ApplicationUser> applicationUsersList = Lists.newArrayList(
                new ApplicationUser(
                        applicationUser.getUsername(),
                        passwordEncoder.encode(applicationUser.getPassword()),
                        authorities,
                        true,
                        true,
                        true,
                        true
                )
        );
//        List<ApplicationUser> applicationUsers = Lists.newArrayList(
//                new ApplicationUser(
//                        "annasmith",
//                        passwordEncoder.encode("password"),
//                        DOCTOR.getGrantedAuthorities(),
//                        true,
//                        true,
//                        true,
//                        true
//                ),
//                new ApplicationUser(
//                        "linda",
//                        passwordEncoder.encode("password"),
//                        ADMIN.getGrantedAuthorities(),
//                        true,
//                        true,
//                        true,
//                        true
//                ),
//                new ApplicationUser(
//                        "tom",
//                        passwordEncoder.encode("password"),
//                        USER.getGrantedAuthorities(),
//                        true,
//                        true,
//                        true,
//                        true
//                )
//        );

        return applicationUsersList;
    }

}