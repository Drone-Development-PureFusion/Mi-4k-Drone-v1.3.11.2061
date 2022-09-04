.class public final Lcom/google/android/gms/b/a;
.super Lcom/google/android/gms/b/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/a$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "http://schema.org/ActivateAction"

.field public static final b:Ljava/lang/String; = "http://schema.org/AddAction"

.field public static final c:Ljava/lang/String; = "http://schema.org/BookmarkAction"

.field public static final d:Ljava/lang/String; = "http://schema.org/CommunicateAction"

.field public static final e:Ljava/lang/String; = "http://schema.org/FilmAction"

.field public static final f:Ljava/lang/String; = "http://schema.org/LikeAction"

.field public static final g:Ljava/lang/String; = "http://schema.org/ListenAction"

.field public static final h:Ljava/lang/String; = "http://schema.org/PhotographAction"

.field public static final i:Ljava/lang/String; = "http://schema.org/ReserveAction"

.field public static final j:Ljava/lang/String; = "http://schema.org/SearchAction"

.field public static final k:Ljava/lang/String; = "http://schema.org/ViewAction"

.field public static final l:Ljava/lang/String; = "http://schema.org/WantAction"

.field public static final m:Ljava/lang/String; = "http://schema.org/WatchAction"

.field public static final n:Ljava/lang/String; = "http://schema.org/ActiveActionStatus"

.field public static final o:Ljava/lang/String; = "http://schema.org/CompletedActionStatus"

.field public static final p:Ljava/lang/String; = "http://schema.org/FailedActionStatus"


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/e;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/b/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/a;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Lcom/google/android/gms/b/a;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lcom/google/android/gms/b/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)Lcom/google/android/gms/b/a;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)Lcom/google/android/gms/b/a;
    .locals 3

    new-instance v1, Lcom/google/android/gms/b/a$a;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/a$a;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/b/e$a;

    invoke-direct {v0}, Lcom/google/android/gms/b/e$a;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/e$a;->c(Ljava/lang/String;)Lcom/google/android/gms/b/e$a;

    move-result-object v2

    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/e$a;->d(Ljava/lang/String;)Lcom/google/android/gms/b/e$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/b/e$a;->b(Landroid/net/Uri;)Lcom/google/android/gms/b/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/e$a;->b()Lcom/google/android/gms/b/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/a$a;->a(Lcom/google/android/gms/b/e;)Lcom/google/android/gms/b/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/a$a;->b()Lcom/google/android/gms/b/e;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/a;

    return-object v0

    :cond_0
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
