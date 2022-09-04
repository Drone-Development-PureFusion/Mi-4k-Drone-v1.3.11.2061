.class public Lcom/google/android/gms/internal/amf$d;
.super Lcom/google/android/gms/internal/amf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/amf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/amf",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/amf;-><init>(ILjava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/internal/amf$1;)V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/google/android/gms/internal/ami;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/amf$d;->b(Lcom/google/android/gms/internal/ami;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ami;)Ljava/lang/String;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/amf$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/amf$d;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/amf$d;->d()I

    move-result v2

    invoke-interface {p1, v1, v0, v2}, Lcom/google/android/gms/internal/ami;->getStringFlagValue(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/amf$d;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method
