package org.cosmosgame.celebrate

import grails.plugins.springsecurity.Secured

@Secured(['ROLE_CREATOR', 'ROLE_ADMIN'])
class CreatorController {

    def index() {
      render 'Creator access only'
    }
}
