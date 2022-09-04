.class public final Lcom/google/android/gms/ads/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/c$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x0

.field public static final f:I = 0x1

.field public static final g:I = 0x2

.field public static final h:I = 0x200

.field public static final i:Ljava/lang/String;


# instance fields
.field private final j:Lcom/google/android/gms/ads/internal/client/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/client/e;->a:Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/ads/c;->i:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/ads/c$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/e;

    invoke-static {p1}, Lcom/google/android/gms/ads/c$a;->a(Lcom/google/android/gms/ads/c$a;)Lcom/google/android/gms/ads/internal/client/e$a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/client/e;-><init>(Lcom/google/android/gms/ads/internal/client/e$a;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/ads/c$a;Lcom/google/android/gms/ads/c$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/c;-><init>(Lcom/google/android/gms/ads/c$a;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/m;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e;->a(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/m;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/e;->a()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e;->a(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/b;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e;->b(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/e;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/e;->c()I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/customevent/a;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/e;->c(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/e;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/e;->e()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/android/gms/ads/internal/client/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/c;->j:Lcom/google/android/gms/ads/internal/client/e;

    return-object v0
.end method
