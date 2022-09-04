.class public interface abstract Lcom/google/android/gms/internal/anv;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/anv$a;
    }
.end annotation


# virtual methods
.method public abstract a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/AttestationData;)V
.end method

.method public abstract a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/SafeBrowsingData;)V
.end method

.method public abstract a(Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/safetynet/HarmfulAppsData;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/Status;Z)V
.end method

.method public abstract a(Ljava/lang/String;)V
.end method
