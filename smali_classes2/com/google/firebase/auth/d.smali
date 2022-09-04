.class public Lcom/google/firebase/auth/d;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String; = "password"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/a;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lcom/google/firebase/auth/c;

    invoke-direct {v0, p0, p1}, Lcom/google/firebase/auth/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
