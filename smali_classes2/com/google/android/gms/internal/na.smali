.class public Lcom/google/android/gms/internal/na;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/na$b;,
        Lcom/google/android/gms/internal/na$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/internal/na;


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/na$a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/na;

    invoke-direct {v0}, Lcom/google/android/gms/internal/na;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/na;->a:Lcom/google/android/gms/internal/na;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/na;->b:Ljava/util/Map;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/na;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/na;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/na;->a:Lcom/google/android/gms/internal/na;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/Runnable;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v1, p0, Lcom/google/android/gms/internal/na;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/na$a;

    invoke-direct {v0, p1, p3, p2}, Lcom/google/android/gms/internal/na$a;-><init>(Landroid/app/Activity;Ljava/lang/Runnable;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/na$b;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/na$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/na$b;->a(Lcom/google/android/gms/internal/na$a;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/na;->b:Ljava/util/Map;

    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v1, p0, Lcom/google/android/gms/internal/na;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/na;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/na$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/na$a;->a()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/na$b;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/na$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/na$b;->b(Lcom/google/android/gms/internal/na$a;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
