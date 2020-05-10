package com.cleverds.controller;

import com.cleverds.logic.model.ThemeDto;
import com.cleverds.logic.service.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@RestController
@RequiredArgsConstructor
public class ThemesController {

    private final ThemeService themeService;

    @GetMapping("/themes/all")
    List<ThemeDto> getAllThemes() {
        return themeService.getAllThemes();
    }

    @GetMapping("/themes")
    ThemeDto getTheme(@RequestHeader String key) {
        return themeService.getTheme(key);
    }

    @PostMapping("/themes")
    List<ThemeDto> createTheme(@RequestBody ThemeDto theme) {
        return themeService.createTheme(theme);
    }

    @PutMapping("/themes")
    List<ThemeDto> updateTheme(@RequestBody ThemeDto theme) {
        return themeService.updateTheme(theme);
    }

    @DeleteMapping("/themes")
    List<ThemeDto> deleteTheme(@RequestBody ThemeDto theme) {
        return themeService.deleteTheme(theme);
    }
}
