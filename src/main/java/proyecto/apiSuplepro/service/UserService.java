package proyecto.apiSuplepro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import proyecto.apiSuplepro.model.User;
import proyecto.apiSuplepro.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User registerUser(User user) {
        user.setContrasena(passwordEncoder.encode(user.getContrasena()));
        return userRepository.save(user);
    }

    public User getUserByEmail(String correo) {
        return userRepository.findByCorreo(correo);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
    public User updateUser(Long id, User updatedUser) {
        Optional<User> existingUserOptional = userRepository.findById(id);
        if (existingUserOptional.isPresent()) {
            User existingUser = existingUserOptional.get();
            
            existingUser.setNombreUsuario(updatedUser.getNombreUsuario());
            
            if (updatedUser.getContrasena() != null && !updatedUser.getContrasena().isEmpty()) {
                existingUser.setContrasena(passwordEncoder.encode(updatedUser.getContrasena()));
            }
            
            return userRepository.save(existingUser);
        }
        throw new IllegalArgumentException("Usuario no encontrado con el ID: " + id);
    }
}
