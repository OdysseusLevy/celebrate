import org.cosmosgame.celebrate.Role
import org.cosmosgame.celebrate.User
import org.cosmosgame.celebrate.UserRole
class BootStrap {

  def init = { servletContext ->

    def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
    def creatorRole = new Role(authority: 'ROLE_CREATOR').save(flush: true)

    //TODO -- this should only be for test servers, not production
    
    // Create default admin
    def adminUser = new User(username: 'admin', enabled: true, password: 'admin123')
    adminUser.save(flush: true)
    UserRole.create adminUser, adminRole, true

    def testUser = new User(username: 'test', enabled: true, password: 'test123')
    testUser.save(flush: true)
    UserRole.create testUser, creatorRole, true

    assert User.count() == 2
    assert Role.count() == 2
    assert UserRole.count() == 2
  }
}
