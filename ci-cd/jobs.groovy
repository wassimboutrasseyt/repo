multibranchPipelineJob('project-monitoring') {

   branchSources {
      git {
         id('project-monitoring-git')
         remote('https://github.com/wassimboutrasseyt/repo')
         credentialsId('github-token')
      }
   }

   triggers {
      periodicFolderTrigger {
         interval('1m')
      }
   }
   orphanedItemStrategy {
      discardOldItems {
         numToKeep(10)
      }
   }
}
