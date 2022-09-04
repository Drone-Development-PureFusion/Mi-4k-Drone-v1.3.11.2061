.class public final Lcom/google/android/gms/ads/search/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/search/a$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/search/b;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/ads/search/a$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/ads/search/a$a;->a(Lcom/google/android/gms/ads/search/a$a;)Lcom/google/android/gms/ads/search/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/search/b$a;->a()Lcom/google/android/gms/ads/search/b;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/search/a;->a:Lcom/google/android/gms/ads/search/b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/ads/search/a$a;Lcom/google/android/gms/ads/search/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/search/a;-><init>(Lcom/google/android/gms/ads/search/a$a;)V

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

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a;->a:Lcom/google/android/gms/ads/search/b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/search/b;->a(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/m;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a;->a:Lcom/google/android/gms/ads/search/b;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/search/b;->o()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a;->a:Lcom/google/android/gms/ads/search/b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/search/b;->a(Landroid/content/Context;)Z

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

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a;->a:Lcom/google/android/gms/ads/search/b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/search/b;->b(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method b()Lcom/google/android/gms/ads/internal/client/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a;->a:Lcom/google/android/gms/ads/search/b;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/search/b;->p()Lcom/google/android/gms/ads/internal/client/e;

    move-result-object v0

    return-object v0
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

    iget-object v0, p0, Lcom/google/android/gms/ads/search/a;->a:Lcom/google/android/gms/ads/search/b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/search/b;->c(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
