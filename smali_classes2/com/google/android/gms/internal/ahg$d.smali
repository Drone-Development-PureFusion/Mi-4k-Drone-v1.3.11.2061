.class public final Lcom/google/android/gms/internal/ahg$d;
.super Lcom/google/android/gms/internal/ahg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ahg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ahg;"
    }
.end annotation


# static fields
.field private static final e:Lcom/google/android/gms/common/api/Status;


# instance fields
.field private final c:Lcom/google/android/gms/internal/aiv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/aiv",
            "<",
            "Lcom/google/android/gms/common/api/a$c;",
            "TTResult;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/g/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/g",
            "<TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x8

    const-string v2, "Connection to Google Play services was lost while executing the API call."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ahg$d;->e:Lcom/google/android/gms/common/api/Status;

    return-void
.end method

.method public constructor <init>(IILcom/google/android/gms/internal/aiv;Lcom/google/android/gms/g/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/google/android/gms/internal/aiv",
            "<",
            "Lcom/google/android/gms/common/api/a$c;",
            "TTResult;>;",
            "Lcom/google/android/gms/g/g",
            "<TTResult;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ahg;-><init>(II)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ahg$d;->d:Lcom/google/android/gms/g/g;

    iput-object p3, p0, Lcom/google/android/gms/internal/ahg$d;->c:Lcom/google/android/gms/internal/aiv;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahg$d;->d:Lcom/google/android/gms/g/g;

    new-instance v1, Lcom/google/firebase/c;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/firebase/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahg$d;->d:Lcom/google/android/gms/g/g;

    new-instance v1, Lcom/google/firebase/a;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/firebase/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahg$d;->c:Lcom/google/android/gms/internal/aiv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahg$d;->d:Lcom/google/android/gms/g/g;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/aiv;->a(Lcom/google/android/gms/common/api/a$c;Lcom/google/android/gms/g/g;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/ahg$d;->e:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ahg$d;->a(Lcom/google/android/gms/common/api/Status;)V

    throw v0

    :catch_1
    move-exception v0

    sget-object v0, Lcom/google/android/gms/internal/ahg$d;->e:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ahg$d;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method
