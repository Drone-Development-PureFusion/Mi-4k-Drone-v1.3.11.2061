.class public final Lcom/google/android/gms/games/internal/h;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/google/android/gms/common/internal/ab;

.field private static final b:Lcom/google/android/gms/internal/aiz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/aiz",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/ab;

    const-string v1, "Games"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/ab;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/games/internal/h;->a:Lcom/google/android/gms/common/internal/ab;

    const-string v0, "games.play_games_dogfood"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/aiz;->a(Ljava/lang/String;Z)Lcom/google/android/gms/internal/aiz;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/games/internal/h;->b:Lcom/google/android/gms/internal/aiz;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/internal/h;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/internal/h;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/common/internal/ab;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/internal/h;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/ab;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/internal/h;->a:Lcom/google/android/gms/common/internal/ab;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/common/internal/ab;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
